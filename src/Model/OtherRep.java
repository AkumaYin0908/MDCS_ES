package Model;

public class OtherRep {
	private Student student;
	private String name;
	private String affiliation;
	private String mobNum;
	
	public int getStudID() {
		return student.getStudID();
	}
	public int getDocNo() {
		return student.getDocNo();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAffiliation() {
		return affiliation;
	}
	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}
	public String getMobNum() {
		return mobNum;
	}
	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}
	
}
