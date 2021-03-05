import java.util.Date;

public class Account {

	private int id; // default = 0;
	private double balance; // def 0
	private double annualInterestRate; // 0 all accs same intRate
	private Date dateCreated;

	public Account() {
		this.id = 0;
		this.balance = 0.0;
		this.annualInterestRate = 0.0;
		this.dateCreated = new Date();
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = 0.0;
		this.dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate / 100;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return getAnnualInterestRate() / 12;
	}

	public double getMonthlyInterest() {
		return getBalance() * getMonthlyInterestRate();
	}

	public void withdraw(double amount) {
		setBalance(getBalance() - amount);
	}

	public void deposit(double amount) {
		setBalance(getBalance() + amount);
	}
	
	public void accountInfo() {
		System.out.println("Account Info");
		System.out.print("Account ID : " + getId() + 
				"\nBalance : " + getBalance() + 
				"\nMonthly Interest : " + getMonthlyInterestRate() +
				"\nDate Created : " + getDateCreated());
	}
}
