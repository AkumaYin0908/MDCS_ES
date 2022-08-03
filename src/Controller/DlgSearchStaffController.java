package Controller;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import DBConnection.SetConnect;
import Model.Staff;
import View.SearchStaffDialog;

public class DlgSearchStaffController {
private Staff staff;
private SearchStaffDialog staffDialog;
SetConnect connect;
Connection sqlConn;
ResultSet rs;
PreparedStatement pst;

	public DlgSearchStaffController(Staff staff, SearchStaffDialog staffDialog) {
		
		connect=new SetConnect();
		connect.connectDB();
		sqlConn=connect.getSQLConn();
		
		this.staff=staff;
		this.staffDialog=staffDialog;
		
		
		
		staffDialog.getSelectButton().addActionListener((ActionEvent e)-> {

				
				if((staffDialog.getTable().getSelectionModel().isSelectionEmpty())) {
					JOptionPane.showMessageDialog(null, "Please select from the table","",JOptionPane.WARNING_MESSAGE);
				}
				else {
					
					getTableData();
					staffDialog.dispose();
					
					
				}
			
		});
		
		staffDialog.getSearchField().getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void insertUpdate(DocumentEvent e) {
				searchLastName();
				
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				searchLastName();
				
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				searchLastName();
				
			}
			
		});
		
		displayStaffTable();
	}
	
	public void displayStaffTable() {
		try {
			pst=sqlConn.prepareStatement("select*from tblstaff where still_employed='1'");
			rs=pst.executeQuery();
			
			
			staffDialog.getTableModel().setRowCount(0);
			while(rs.next()) {
				String name=rs.getString("last_name")+", " + rs.getString("first_name") + " "+ (rs.getString("middle_name").equals("N/A")? "":rs.getString("middle_name"));
				staffDialog.getTableModel().addRow(new String[] {String.valueOf(rs.getInt("staff_id")),name,rs.getString("position")});
			}
			
			
			
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
	}

	public void searchLastName()	{
		try {
			String toSearch=staffDialog.getSearchField().getText();
			pst=sqlConn.prepareStatement("select*from tblstaff where last_name like ? and still_employed='1'");
			pst.setString(1, toSearch+'%');
			rs=pst.executeQuery();
			
			
			staffDialog.getTableModel().setRowCount(0);
			while(rs.next()) {
				String name=rs.getString("last_name")+", " + rs.getString("first_name") + " "+ (rs.getString("middle_name").equals("N/A")? "":rs.getString("middle_name"));
				staffDialog.getTableModel().addRow(new String[] {String.valueOf(rs.getInt("staff_id")),name,rs.getString("position")});
			}
			
			
			
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	
	}
	
	public void getTableData() {
		int row = staffDialog.getTable().getSelectedRow();
		try {
			staff.setStaffID((Integer.parseInt(staffDialog.getTableModel().getValueAt(row,0).toString())));
			
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
				
			
				
				
			
			
			
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
		}catch(Exception ex) {}
	}


}

