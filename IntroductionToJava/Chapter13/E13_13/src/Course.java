
public class Course implements Cloneable{

	private String courseName;
	private String[] students = new String[10];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		if (numberOfStudents == students.length) {
			String[] temp = new String[students.length * 2];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}

		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public void dropStudent(String student) {
		int index = search(students, student);
		if (index >= 0) {
			for (int i = index; i < students.length - 1; i++) {
				students[i] = students[i + 1];
			}
		}

		numberOfStudents--;
	}
	

	public int search(String[] array, String key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i;
			}
		}

		return -1;
	}
	
	@Override 
	public Object clone() throws CloneNotSupportedException{
		Course clone = (Course)super.clone();
		clone.students = (String[])students.clone();
		return clone;
	}

	
}
