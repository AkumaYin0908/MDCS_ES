package Model;

public class Staff extends Person{
	

	

	protected int staffID;
	private String position;
	private boolean isEmployed;
	
	
	
	public void setStaffID(int staffID) {
		this.staffID=staffID;
	}
	
	public int getStaffID() {
		return staffID;
	}
	
	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName=lastName;
		
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName=firstName;
		
	}

	@Override
	public String getMidName() {
		return midName;
	}

	@Override
	public void setMidName(String midName) {
		this.midName=midName;
		
	}
	
	public void setPosition(String position) {
		this.position = position;
	}

	public String getPosition() {
		return position;
	}
	
	public void setIsEmployed(boolean isEmployed) {
		this.isEmployed = isEmployed;
	}

	public boolean getIsEmployed() {
		return isEmployed;
	}

	
	
	
}
