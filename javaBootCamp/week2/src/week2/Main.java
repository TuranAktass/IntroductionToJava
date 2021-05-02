package week2;

public class Main {

	public static void main(String args[]) {
		CourseManager courseManager = new CourseManager();
		Category programming = new Category(1, "programming", "detais");

		Course javaCamp = new Course(101, "Java-React Camp", "Engin Demirog", programming, "details");
		Course cSharpCamp = new Course(102, "C#", "Engin Demirog", programming, "details");

		courseManager.addCourse(javaCamp);
		courseManager.addCourse(cSharpCamp);

		courseManager.deleteCourse(javaCamp);
	}
}
