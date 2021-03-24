public class Staff extends Employee {

	private String title;

	public Staff(String name, String address, String e_mail, long phoneNumber, String office, double salary,
			String title) {
		super(name, address, e_mail, phoneNumber, office, salary);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "name: " + getName() + "(staff)";
	}

}
