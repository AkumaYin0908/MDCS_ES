package Model;



public class User extends Staff  {
	
	private int userID;
	private String userName;
	private String userPassword;
	private String designation;
	
	
	public void setUserID(int userID) {
		this.userID=userID;
	}
	
	public int getUserID() {
		return userID;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPassword() {
		return userPassword;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}
	
	


}
