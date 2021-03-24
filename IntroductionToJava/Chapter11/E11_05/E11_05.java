import java.util.ArrayList;

public class E11_05 {

	public static void main(String args[]) {
		Course course = new Course("CS50");
		course.addStudent("A");
		course.addStudent("B");
		course.addStudent("C");
		course.addStudent("D");

		ArrayList<String> list = course.getList();

		System.out.println(list.toString());
	}
}
