package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DBConnection.SetConnect;
import Model.Staff;
import View.StaffInputDialog;

public class DlgStaffInputController {
	private StaffInputDialog dlgStaffInput;
	private Staff staff; 
	SetConnect connect;
	Connection sqlConn;
	ResultSet rs;
	PreparedStatement pst;
	
	public DlgStaffInputController(StaffInputDialog sInputDialog) {
		
	}
	
}
