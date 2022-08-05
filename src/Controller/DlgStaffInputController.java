package Controller;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import DBConnection.SetConnect;
import Model.Staff;
import View.StaffForm;
import View.StaffInputDialog;

public class DlgStaffInputController {
	private StaffInputDialog dlgStaffInput;
	private Staff staff; 
	private boolean isEmployed;
	SetConnect connect;
	Connection sqlConn;
	ResultSet rs;
	PreparedStatement pst;
	
	public DlgStaffInputController(StaffInputDialog dlgStaffInput,Staff staff) {
		connect =new SetConnect();
		connect.connectDB();
		sqlConn=connect.getSQLConn();
		
		this.dlgStaffInput=dlgStaffInput;
		this.staff=staff;
		
		
		dlgStaffInput.getBtnBack().addActionListener((ActionEvent e)->{
			dlgStaffInput.dispose();
		});
		
		dlgStaffInput.getBtnSave().addActionListener((ActionEvent e)->{
		
			if(dlgStaffInput.getBtnSave().getText().equals("Save")) saveStaff();
			else if(dlgStaffInput.getBtnSave().getText().equals("Update")) updateStaff();
			
		});
	}

	public void saveStaff() {
		try {
			pst=sqlConn.prepareStatement("select*from tblstaff where staff_id=?");
			pst.setInt(1, Integer.parseInt(dlgStaffInput.getTxtStaffID().getText()));
			rs=pst.executeQuery();
			
			if(rs.next()) {
				JOptionPane.showMessageDialog(null,"Staff already exists!","Already Exist",JOptionPane.WARNING_MESSAGE);
				
			}
			else {
				getData();
				pst=sqlConn.prepareStatement("insert into tblstaff(staff_id,last_name,first_name,middle_name,position,still_employed)"
						+"values(?,?,?,?,?,?)");
				pst.setInt(1, staff.getStaffID());
				pst.setString(2, staff.getLastName());
				pst.setString(3, staff.getFirstName());
				pst.setString(4, staff.getMidName());
				pst.setString(5, staff.getPosition());
				pst.setBoolean(6, staff.getIsEmployed());
				
				int i=pst.executeUpdate();
				if (i==1){
					JOptionPane.showMessageDialog(null,"Staff " + staff.getName() 
					+ " has been saved!","Saved", JOptionPane.INFORMATION_MESSAGE);
					refreshTable();
					dlgStaffInput.getFrmStaff().getBtnDelete().setEnabled(false);
					dlgStaffInput.getFrmStaff().getBtnEdit().setEnabled(false);
					dlgStaffInput.dispose();
					
					
				}
				else{
			           JOptionPane.showMessageDialog(null,"Record Failed","Error",JOptionPane.ERROR_MESSAGE);
			    }
			}
		}
		catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
	}
	
	public void updateStaff() {
		getData();
		try {
			pst=sqlConn.prepareStatement("update tblstaff set last_name =?, first_name=?, middle_name=?, position=?, still_employed=? where staff_id=?");
			pst.setString(1, staff.getLastName());
			pst.setString(2, staff.getFirstName());
			pst.setString(3, staff.getMidName());
			pst.setString(4, staff.getPosition());
			pst.setBoolean(5, staff.getIsEmployed());
			pst.setInt(6, staff.getStaffID());
			
			int i=pst.executeUpdate();
			
			if(i==1) {
				JOptionPane.showMessageDialog(null, "Staff " + staff.getName() + " has been updated!", "Updated", JOptionPane.INFORMATION_MESSAGE);
				refreshTable();
				dlgStaffInput.getFrmStaff().getBtnDelete().setEnabled(false);
				dlgStaffInput.getFrmStaff().getBtnEdit().setEnabled(false);
				dlgStaffInput.dispose();
				
			}
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public void getData() {
		staff.setStaffID(Integer.parseInt(dlgStaffInput.getTxtStaffID().getText()));
		staff.setLastName(dlgStaffInput.getTxtLastName().getText());
		staff.setFirstName(dlgStaffInput.getTxtFirstName().getText());
		staff.setMidName(dlgStaffInput.getTxtMidName().getText().isEmpty() ? "N/A":dlgStaffInput.getTxtMidName().getText());
		staff.setPosition(dlgStaffInput.getTxtPosition().getText());
		
		isEmployed=dlgStaffInput.getRdbEmployed().isSelected() ? true:false;
		staff.setIsEmployed(isEmployed);
		
	}
	public void refreshTable() {
		try {
			pst=sqlConn.prepareStatement("select*from tblstaff");
			rs=pst.executeQuery();
			
			
			dlgStaffInput.getTableModel().setRowCount(0);
			while(rs.next()) {
				String name=rs.getString("last_name")+", " + rs.getString("first_name") + " "+ (rs.getString("middle_name").equals("N/A")? "":rs.getString("middle_name"));
				dlgStaffInput.getTableModel().addRow(new String[] {String.valueOf(rs.getInt("staff_id")),name,rs.getString("position"),
						(rs.getBoolean("still_employed")==true)?"Employed":"Not Employed"});
			}
			
			
			
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
}
