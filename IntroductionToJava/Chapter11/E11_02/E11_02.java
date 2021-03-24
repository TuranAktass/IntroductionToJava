public class E11_02 {
	public static void main(String args[]) {
		Person person = new Person("Ahmet", "Istanbul", "ahmet@mail.com", 123_456_7890);
		Student student = new Student("Mehmet", "Ankara", "mehmet@mail.com", 111_111_1111, Student.FRESHMAN);
		Employee employee = new Employee("emp", "empCity", "emp@emp.com", 122_222_2222, "Office1", 8000.0);
		Faculty faculty = new Faculty("fac", "F", "fac@fac.com", 111_122_2222, "Office1", 8000.0, "10:00-17:00",
				"rank");
		Staff staff = new Staff("staff", "S", "staff@staff.com", 121_121_2211, "Office1", 5000.0, "rank");

		System.out.println(person);
		System.out.println(student);
		System.out.println(employee);
		System.out.println(faculty);
		System.out.println(staff);
	}
}
