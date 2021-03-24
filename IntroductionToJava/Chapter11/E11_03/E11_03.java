
public class E11_03 {
	public static void main(String args[]) {
		Account acc = new Account(1, 100_000);
		SavingsAccount savingAcc = new SavingsAccount(2, 10_000);
		CheckingAccount checkingAcc = new CheckingAccount(3, 20_000, 5_000);
		
		acc.accountInfo();
		savingAcc.accountInfo();
		checkingAcc.accountInfo();
	}
}
