package Controller;

import Model.Staff;
import Model.User;
import View.SearchStaffDialog;
import View.UserForm;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import DBConnection.SetConnect;



public class frmUserController {

	private UserForm frmUser;
	private User user;
	private Staff staff;
	SetConnect connect;
	Connection sqlConn;
	ResultSet rs;
	PreparedStatement pst;
	
	public frmUserController(UserForm frmUser, User user) {
		connect=new SetConnect();
		connect.connectDB();
		sqlConn=connect.getSQLConn();
		
		this.frmUser=frmUser;
		this.user=user;
		
		
		
		
		frmUser.getAddButton().addActionListener((ActionEvent e)->{
			clearFields();
			callStaffDialog();
			expandGUI();

		});
		
		frmUser.getEditButton().addActionListener((ActionEvent e)->{
			expandGUI();
			
			if(frmUser.getEditButton().getText().equals("Edit")) {
					frmUser.getEditButton().setText("Update");
					
				}
			else if (frmUser.getEditButton().getText().equals("Update")) {
				if(!frmUser.getPassword().getText().equals(frmUser.getRePass().getText())) {
					JOptionPane.showMessageDialog(null,"Password not Match!","Error",JOptionPane.ERROR_MESSAGE);
					frmUser.getPassword().requestFocus();
					frmUser.getRePass().setText("");
				}
				else {
					updateUser();
					frmUser.getEditButton().setText("Edit");
				}
					
			
			
			}
		});
		
		frmUser.getSaveButton().addActionListener((ActionEvent e)->{
			saveUser();
		});
		
		
		frmUser.getDeleteButton().addActionListener((ActionEvent e)->{
			deleteUser();
		});
		
		frmUser.getTable().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(e.getClickCount()==1) {
						getTableData();
						frmUser.getDeleteButton().setEnabled(true);
						frmUser.getEditButton().setEnabled(true);
					}
					
				}catch(Exception ex) {}
			}
		});
		
		displayUserTable();
		
	}
	
	public void displayUserTable() {
		loadUserID();
		try {
			pst=sqlConn.prepareStatement("select*from tbluser");
			rs=pst.executeQuery();
			
			
			frmUser.getTableModel().setRowCount(0);
			while(rs.next()) {
				String name=rs.getString("last_name")+", " + rs.getString("first_name") + " "+ (rs.getString("middle_name").equals("N/A")? "":rs.getString("middle_name"));
				frmUser.getTableModel().addRow(new String[] {String.valueOf(rs.getInt("user_id")),name,rs.getString("user_name"),
						rs.getString("designation")});
			}
			
			
			
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
	}
	
	public void loadUserID() {
		
		try {
			pst=sqlConn.prepareStatement("select * from tbluser where user_id=(select max(user_id) from tbluser)");
			rs=pst.executeQuery();
		
			while(rs.next()) {
			user.setUserID(rs.getInt("user_id"));
			}
			frmUser.getUserID().setText(String.valueOf(user.getUserID()+1));
			
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	public void expandGUI() {
		frmUser.setSize(new Dimension(480,585));
		frmUser.getInfoPanel().setVisible(true);
		frmUser.getbuttonPanel().setBounds(10, 505, 465, 70);
		frmUser.getLastName().requestFocus();
		frmUser.getRePass().setEnabled(true);
		frmUser.getRePass().setVisible(true);
		frmUser.getLabelRePass().setEnabled(true);
		frmUser.getLabelRePass().setVisible(true);
		frmUser.getSaveButton().setEnabled(true);
	}
	
	public void resetGUI() {
		frmUser.setSize(new Dimension(480, 420));	
		frmUser.getInfoPanel().setVisible(false);
		frmUser.getbuttonPanel().setBounds(10, 350, 465, 70);
		frmUser.getRePass().setEnabled(false);
		frmUser.getRePass().setVisible(false);
		frmUser.getLabelRePass().setEnabled(false);
		frmUser.getLabelRePass().setVisible(false);
		frmUser.getSaveButton().setEnabled(false);
	}
	
	public void clearFields() {
		user.setUserID(0);
		loadUserID();
		frmUser.getTable().getSelectionModel().clearSelection();
		frmUser.getLastName().setText("");
		frmUser.getFirstName().setText("");
		frmUser.getMidName().setText("");
		frmUser.getUserName().setText("");
		frmUser.getPassword().setText("");
		frmUser.getRePass().setText("");
		frmUser.getDesignation().setSelectedIndex(0);
	}
	
	public void getTableData() {
		int row = frmUser.getTable().getSelectedRow();
		try {
			user.setUserID((Integer.parseInt(frmUser.getTableModel().getValueAt(row,0).toString())));
			
			pst=sqlConn.prepareStatement("select*from tbluser where user_id=?");
			pst.setInt(1,user.getUserID());
			rs=pst.executeQuery();
			
			if(rs.next()==true) {
				user.setUserID(rs.getInt("user_id"));
				user.setLastName(rs.getString("last_name"));
				user.setFirstName(rs.getString("first_name"));
				user.setMidName(rs.getString("middle_name"));
				user.setUserName(rs.getString("user_name"));
				user.setUserPassword(rs.getString("user_pass"));
				user.setDesignation(rs.getString("designation"));
			}
			frmUser.getUserID().setText(String.valueOf(user.getUserID()));
			frmUser.getLastName().setText(user.getLastName());
			frmUser.getFirstName().setText(user.getFirstName());
			frmUser.getMidName().setText(user.getMidName());
			frmUser.getUserName().setText(user.getUserName());
			frmUser.getPassword().setText(user.getUserPassword());
			frmUser.getDesignation().setSelectedItem(user.getDesignation());
			
			
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
	}
	
	public void saveUser() {
		try {
			pst=sqlConn.prepareStatement("select * from tbluser where user_id=?");
			pst.setInt(1,Integer.parseInt(frmUser.getUserID().getText()));
			rs=pst.executeQuery();
			
			if(rs.next()) {
				JOptionPane.showMessageDialog(null,"User already exist!","Already Exist!", JOptionPane.WARNING_MESSAGE);
				clearFields();
			}
			else {
				if(!frmUser.getPassword().getText().equals(frmUser.getRePass().getText())) {
					JOptionPane.showMessageDialog(null,"Password not Match!","Error",JOptionPane.ERROR_MESSAGE);
					frmUser.getPassword().requestFocus();
					frmUser.getRePass().setText("");
				}
				else {
					getData();
					
					pst=sqlConn.prepareStatement("insert into tbluser(user_id,staff_id,last_name,first_name,middle_name,user_name,user_pass"
							+ ",designation,still_employed) values(?,?,?,?,?,?,?,?,?)");
					pst.setInt(1,user.getUserID());
					pst.setInt(2, user.getStaffID());
					pst.setString(3,user.lastName);
					pst.setString(4,user.getFirstName());
					pst.setString(5, user.getMidName());
					pst.setString(6, user.getUserName());
					pst.setString(7,user.getUserPassword());
					pst.setString(8, user.getDesignation());
					pst.setBoolean(9, user.getIsEmployed());
					
					
					int i=pst.executeUpdate();
					if(i==1) {
						JOptionPane.showMessageDialog(null,"User " + user.getName() + " has been saved!","Saved", JOptionPane.INFORMATION_MESSAGE);
						clearFields();
						resetGUI();
						displayUserTable();
						loadUserID();
					}
					else{
				           JOptionPane.showMessageDialog(null,"Record Failed","Error",JOptionPane.ERROR_MESSAGE);
				    }
				
				}
			}
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
	}
	
	public void deleteUser() {
		try {
			pst=sqlConn.prepareStatement("delete from tbluser where user_id=?");
			pst.setInt(1, user.getUserID());
			
			
			int i=pst.executeUpdate();
			if(i==1) {
				JOptionPane.showMessageDialog(null,"User " + user.getName() + " has been deleted!","Deleted", JOptionPane.INFORMATION_MESSAGE);
				clearFields();
				resetGUI();
				displayUserTable();
				
			}
			else{
		           JOptionPane.showMessageDialog(null,"Record Failed","Error",JOptionPane.ERROR_MESSAGE);
		    }
			
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
	}
	
	public void callStaffDialog() {
		staff=new Staff();
		SearchStaffDialog staffDialog=new SearchStaffDialog(frmUser);
		staffDialogController searchStaffController=new staffDialogController(staff, staffDialog);
		staffDialog.setVisible(true);
		
		user.setStaffID(staff.getStaffID());
		frmUser.getLastName().setText(staff.getLastName());
		frmUser.getFirstName().setText(staff.getFirstName());
		frmUser.getMidName().setText(staff.getMidName());
		user.setIsEmployed(staff.getIsEmployed());
		
	}
	
	public void updateUser() {
		try {
			user.setUserID(Integer.parseInt(frmUser.getUserID().getText()));
			user.setLastName(frmUser.getLastName().getText());
			user.setFirstName(frmUser.getFirstName().getText());
			user.setMidName(frmUser.getMidName().getText());
			user.setUserName(frmUser.getUserName().getText());
			user.setUserPassword(frmUser.getPassword().getText());
			user.setDesignation(frmUser.getDesignation().getSelectedItem().toString());
			
			 
			
			pst=sqlConn.prepareStatement("update tbluser set last_name =?, first_name=?, middle_name=?,user_name=?,user_pass=?,designation=? where user_id=?");
			
			
			pst.setString(1, user.getLastName());
			pst.setString(2, user.getFirstName());
			pst.setString(3, user.getMidName());
			pst.setString(4, user.getUserName());
			pst.setString(5, user.getUserPassword());
			pst.setString(6, user.getDesignation());
			pst.setInt(7, user.getUserID());
			
			int i=pst.executeUpdate();
			if(i==1) {
				JOptionPane.showMessageDialog(null,"User " + user.getUserName() + " has been updated!","Updated", JOptionPane.INFORMATION_MESSAGE);
				clearFields();
				resetGUI();
				displayUserTable();
				
			}
			else{
		           JOptionPane.showMessageDialog(null,"Update Failed","Error",JOptionPane.ERROR_MESSAGE);
		    }
		}
		catch(SQLException ex) {
				ex.printStackTrace();//	JOptionPane.showMessageDialog(null, ex);
		}
	
	}
	
	
	
	public void getData() {
		user.setUserID(Integer.parseInt(frmUser.getUserID().getText()));
		user.setLastName(frmUser.getLastName().getText());
		user.setFirstName(frmUser.getFirstName().getText());
		user.setMidName(frmUser.getMidName().getText().isEmpty()?"N/A":frmUser.getMidName().getText());
		user.setUserName(frmUser.getUserName().getText());
		user.setUserPassword(frmUser.getPassword().getText());
		user.setDesignation(String.valueOf(frmUser.getDesignation().getSelectedItem()));
		
	
	}
	
}
