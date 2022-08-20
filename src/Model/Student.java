package Model;

import java.util.Date;

import Model.Place.Address;

public class Student extends Person {
	
	private int StudID;
	private int DocNo;
	private String nickName;
	private Date birthDate;
	private Address birthPlace;
	private int age;
	private String religion;
	private String nationality;
	private String gender;
	private String mobNum;
	private String email;
	private int sibEnrolled;
	private String ordinal;
	private int gradeLevel;
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private Address address;
	private String postal;
	private String studStatus;
	private boolean pwd;
	private String disability;
	private int siblingsEnrolled;
	private String achievements;
	

	public int getStudID() {
		return StudID;
	}

	public void setStudID(int studID) {
		StudID = studID;
	}

	public int getDocNo() {
		return DocNo;
	}

	public void setDocNo(int docNo) {
		DocNo = docNo;
	}
	
	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getMidName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMidName(String midName) {
		// TODO Auto-generated method stub
		
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Address getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(Address birthPlace) {
		this.birthPlace = birthPlace;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobNum() {
		return mobNum;
	}

	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getStudStatus() {
		return studStatus;
	}

	public void setStudStatus(String studStatus) {
		this.studStatus = studStatus;
	}

	public boolean isPwd() {
		return pwd;
	}

	public void setPwd(boolean pwd) {
		this.pwd = pwd;
	}

	public String getDisability() {
		return disability;
	}

	public void setDisability(String disability) {
		this.disability = disability;
	}

	public int getSiblingsEnrolled() {
		return siblingsEnrolled;
	}

	public void setSiblingsEnrolled(int siblingsEnrolled) {
		this.siblingsEnrolled = siblingsEnrolled;
	}

	public String getAchievements() {
		return achievements;
	}

	public void setAchievements(String achievements) {
		this.achievements = achievements;
	}

	public int getSibEnrolled() {
		return sibEnrolled;
	}

	public void setSibEnrolled(int sibEnrolled) {
		this.sibEnrolled = sibEnrolled;
	}

	public String getOrdinal() {
		return ordinal;
	}

	public void setOrdinal(String ordinal) {
		this.ordinal = ordinal;
	}

	public int getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	
	

}
