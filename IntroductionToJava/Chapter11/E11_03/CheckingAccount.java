
public class CheckingAccount extends Account {
	private double overdraft;

	public CheckingAccount(int id, double balance, double overdraft) {
		super(id, balance);
		this.overdraft = overdraft;
	}

	@Override
	public void withdraw(double amount) {
		if (getBalance() - amount >= 0 - overdraft) {
			setBalance(getBalance() - amount);
		}
	}
}
