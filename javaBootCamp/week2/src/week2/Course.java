package week2;

public class Course {

	private int courseId;
	private String courseName;
	private String instructor;
	private Category courseCategory;
	private String courseDetails;

	public Course() {

	}

	public Course(int courseId, String courseName, String instructor,Category category, String courseDetails) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.instructor = instructor;
		this.courseCategory = category;
		this.courseDetails = courseDetails;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	public Category getCategory() {
		return courseCategory;	
		}
	
	public void setCategory(Category category) {
		this.courseCategory = category;
	}

	public String getCourseDetails() {
		return courseDetails;
	}

	public void setCourseDetails(String courseDetails) {
		this.courseDetails = courseDetails;
	}

}
