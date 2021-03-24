public class Student extends Person {

	public static final int FRESHMAN = 0;
	public static final int SOPHOMORE = 1;
	public static final int JUNIOR = 2;
	public static final int SENIOR = 3;

	private int classStatus;

	public Student(String name, String address, String e_mail, long phoneNumber, int classStatus) {
		super(name, address, e_mail, phoneNumber);
		this.classStatus = classStatus;
	}

	public int getClassStatus() {
		return classStatus;
	}

	@Override
	public String toString() {
		return "name: " + getName() + "(student)";
	}
}
