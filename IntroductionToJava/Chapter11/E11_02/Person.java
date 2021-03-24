public class Person {
	private String name;
	private String address;
	private String e_mail;
	private long phoneNumber;

	public Person() {
		this("Ahmet", "Istanbul", "ahmet@mail.com", 01231231212);
	}

	public Person(String name, String address, String e_mail, long phoneNumber) {
		this.name = name;
		this.address = address;
		this.e_mail = e_mail;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return e_mail;
	}

	public void setEmail(String e_mail) {
		this.e_mail = e_mail;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Name : " + getName() + "(person)";
	}
}
