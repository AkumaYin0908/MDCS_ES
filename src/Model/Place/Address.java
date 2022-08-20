package Model.Place;

public class Address {
	
	private String street;
	private Barangay barangay;
	private MunCity munCity;
	private Province province;
	
	
	Address(Barangay barangay,MunCity munCity, Province province){
		this.barangay=barangay;
		this.munCity=munCity;
		this.province=province;
		
	}
	
	Address(String street,Barangay barangay,MunCity munCity, Province province){
		this.street=street;
		this.barangay=barangay;
		this.munCity=munCity;
		this.province=province;
		
	}

	public String getStreet() {
		return street;
	}

	public Barangay getBarangay() {
		return barangay;
	}

	public MunCity getMunCity() {
		return munCity;
	}

	public Province getProvince() {
		return province;
	}
	
	
}
