
public class SavingsAccount extends Account {

	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}

	@Override
	public void withdraw(double amount) {
		if (getBalance() - amount >= 0) {
			setBalance(getBalance() - amount);
		}
	}
}
