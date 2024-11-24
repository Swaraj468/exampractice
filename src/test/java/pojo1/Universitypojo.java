package pojo1;

public class Universitypojo {
	private String UniversityName;
	private String Degree;
	private String Section;
	private String Course;
	private String CollegeAddress;
	
	public Universitypojo(String UniversityName, String Degree, String Section
			, String Course, String CollegeAddress) {
		this.UniversityName = UniversityName;
		this.Degree = Degree;
		this.Section = Section;
		this.Course = Course;
		this.CollegeAddress = CollegeAddress;
		
		
	}

	public String getUniversityName() {
		return UniversityName;
	}

	public void setUniversityName(String universityName) {
		UniversityName = universityName;
	}

	public String getDegree() {
		return Degree;
	}

	public void setDegree(String degree) {
		Degree = degree;
	}

	public String getSection() {
		return Section;
	}

	public void setSection(String section) {
		Section = section;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public String getCollegeAddress() {
		return CollegeAddress;
	}

	public void setCollegeAddress(String collegeAddress) {
		CollegeAddress = collegeAddress;
	}

}
