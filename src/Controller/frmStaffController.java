package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import DBConnection.SetConnect;
import Model.Staff;
import View.StaffForm;
import View.StaffInputDialog;

public class FrmStaffController {
	private StaffForm frmStaff;
	private Staff staff;
	private StaffInputDialog dlgStaffInput;
	private DlgStaffInputController dlgStaffController;
	SetConnect connect;
	Connection sqlConn;
	ResultSet rs;
	PreparedStatement pst;
	
	
	public FrmStaffController(StaffForm frmStaff, Staff staff) {
		connect=new SetConnect();
		connect.connectDB();
		sqlConn=connect.getSQLConn();
		
		this.frmStaff=frmStaff;
		this.staff=staff;
		
		
		
		frmStaff.getBtnAdd().addActionListener((ActionEvent e)->{
			loadStaffID();
			
			dlgStaffInput =new StaffInputDialog(frmStaff);
			dlgStaffInput.getTxtStaffID().setText(String.valueOf(staff.getStaffID()+1));
			dlgStaffController =new DlgStaffInputController(dlgStaffInput,staff);
			dlgStaffInput.getRadioPanel().setVisible(false);
			dlgStaffInput.setVisible(true);
			
			
		});
		
		frmStaff.getBtnEdit().addActionListener((ActionEvent e)->{
			
			dlgStaffInput=new StaffInputDialog(frmStaff);
			dlgStaffController=new DlgStaffInputController(dlgStaffInput,staff);
			
			dlgStaffInput.getTxtStaffID().setText(String.valueOf(staff.getStaffID()));
			dlgStaffInput.getTxtLastName().setText(staff.getLastName());
			dlgStaffInput.getTxtFirstName().setText(staff.getFirstName());
			dlgStaffInput.getTxtMidName().setText(staff.getMidName());
			dlgStaffInput.getTxtPosition().setText(staff.getPosition());
			if(staff.getIsEmployed()) dlgStaffInput.getRdbEmployed().setSelected(true);
			else dlgStaffInput.getrdbNemployed().setSelected(true);
			dlgStaffInput.getBtnSave().setText("Update");
			dlgStaffInput.setVisible(true);
		
		});
		frmStaff.getBtnDelete().addActionListener((ActionEvent e)->{
			deleteStaff();
		});
		
		frmStaff.getTable().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(e.getClickCount()==1) {
						getTableData();
						frmStaff.getBtnEdit().setEnabled(true);
						frmStaff.getBtnDelete().setEnabled(true);
					}
					
				}catch(Exception ex) {}
			}
		});
		
		displayUserTable();
		
		

	}
	
	public void displayUserTable() {
		
		try {
			pst=sqlConn.prepareStatement("select*from tblstaff");
			rs=pst.executeQuery();
			
			
			frmStaff.getTableModel().setRowCount(0);
			while(rs.next()) {
				String name=rs.getString("last_name")+", " + rs.getString("first_name") + " "+ (rs.getString("middle_name").equals("N/A")? "":rs.getString("middle_name"));
				frmStaff.getTableModel().addRow(new String[] {String.valueOf(rs.getInt("staff_id")),name,rs.getString("position"),
						(rs.getBoolean("still_employed")==true)?"Employed":"Not Employed"});
			}
			
			
			
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
	}

	public void loadStaffID() {
		
		try {
			pst=sqlConn.prepareStatement("select * from tblstaff where staff_id=(select max(staff_id) from tblstaff)");
			rs=pst.executeQuery();
		
			while(rs.next()) {
			staff.setStaffID(rs.getInt("staff_id"));
			}
			
			
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	public void getTableData() {
		int row = frmStaff.getTable().getSelectedRow();
		try {
			staff.setStaffID((Integer.parseInt(frmStaff.getTableModel().getValueAt(row,0).toString())));
			
			pst=sqlConn.prepareStatement("select*from tblstaff where staff_id=?");
			pst.setInt(1,staff.getStaffID());
			rs=pst.executeQuery();
			
			if(rs.next()==true) {
				staff.setStaffID(rs.getInt("staff_id"));
				staff.setLastName(rs.getString("last_name"));
				staff.setFirstName(rs.getString("first_name"));
				staff.setMidName(rs.getString("middle_name"));
				staff.setPosition(rs.getString("position"));
				staff.setIsEmployed(rs.getBoolean("still_employed"));
				
				
			}
			//System.out.println("Staff ID: "+staff.getStaffID());
			
			
		}
		catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
	}
	
	public void deleteStaff() {
		int reply=JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this staff?","Are you sure?",JOptionPane.YES_NO_OPTION);
		
		if(reply==JOptionPane.YES_OPTION) {
			try {
				pst=sqlConn.prepareStatement("delete from tblstaff where staff_id=?");
				pst.setInt(1, staff.getStaffID());
				
				int i=pst.executeUpdate();
				if(i==1) {
					JOptionPane.showMessageDialog(null, "Staff" + staff.getName() + " has been deleted!","Deleted",JOptionPane.INFORMATION_MESSAGE);
					reload();
				}
			}
			catch(SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public void reload() {
		staff.setStaffID(0);
		frmStaff.getBtnEdit().setEnabled(false);
		frmStaff.getBtnDelete().setEnabled(false);
		frmStaff.getTable().getSelectionModel().clearSelection();
		displayUserTable();
	}
	
}
