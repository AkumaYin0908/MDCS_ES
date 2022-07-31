package DBConnection;

import java.sql.*;
import javax.swing.JOptionPane;

public class SetConnect {

private static final String user="root";
private static final String pass="1234";
private static final String dbConn="jdbc:mysql://localhost:3306/dbschool";

private Connection sqlConn=null;



public void connectDB() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		sqlConn=DriverManager.getConnection(dbConn,user,pass);
	}catch(ClassNotFoundException | SQLException e) {
		JOptionPane.showMessageDialog(null, e);
	}
}

public Connection getSQLConn() {
	return sqlConn;
}
}
