
public class Employee extends Person {
	private String office;
	private double salary;
	private MyDate dateHired;

	public Employee(String name, String address, String e_mail, long phoneNumber, String office, double salary) {
		super(name, address, e_mail, phoneNumber);
		this.office = office;
		this.salary = salary;

		dateHired = new MyDate();
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public MyDate getDateHired() {
		return dateHired;
	}

	@Override
	public String toString() {
		return "name: " + getName() + "(employee)";
	}
}
