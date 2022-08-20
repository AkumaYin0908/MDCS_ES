package Model;

public class SchoolAttended {
	private Student student;
	private String gradeLevel;
	private String schoolName;
	private String periodCovered;
	
	public int getStudID() {
		return student.getStudID();
	}
	
	public int getDocNo() {
		return student.getDocNo();
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getPeriodCovered() {
		return periodCovered;
	}

	public void setPeriodCovered(String periodCovered) {
		this.periodCovered = periodCovered;
	}
	
	
}
