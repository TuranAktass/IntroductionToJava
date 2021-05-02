package week2;

public class CourseManager {
	
	public void addCourse(Course course) {
		System.out.println("Course added: " + course.getCourseName());
	}
	
	public void deleteCourse(Course course) {
		System.out.println("Course deleted: " + course.getCourseName());
	}
}
