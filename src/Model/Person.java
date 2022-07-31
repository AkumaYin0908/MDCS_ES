package Model;

public abstract class Person implements Name {

	public String lastName;
	public String firstName;
	public  String midName;
	
	
	
	
	

	public String getName() {
		if(midName.isEmpty() || midName.equals("N/A"))
		return lastName + " ," + firstName;
		
		else return lastName + " ," + firstName + " ," + midName;
	}
}

