
public class E13_13 {

	public static void main(String args[]) throws CloneNotSupportedException {
		Course course1 = new Course("Course One");
		
		course1.addStudent("p1");
		course1.addStudent("p2");
		course1.addStudent("p3");
		
		String [] course1Students = course1.getStudents();
		
		System.out.println("Course One's Students:");
		for(int i = 0; i < course1.getNumberOfStudents(); i++) {
			System.out.println((i + 1) + ". " + course1Students[i]);
		}
		
		Course clone = (Course)course1.clone();
		
		String[] cloneStudents = clone.getStudents();
		
		System.out.println("Clone's Students:");
		for(int i = 0; i < clone.getNumberOfStudents(); i++) {
			System.out.println((i + 1) + ". " + cloneStudents[i]);
		}
		
		}
}
