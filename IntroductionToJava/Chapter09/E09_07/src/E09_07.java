public class E09_07 {
	
	public static void main(String args[]) {
		Account newAccount = new Account(1122 , 20_000);
		newAccount.setAnnualInterestRate(4.5);
		newAccount.withdraw(2_500);
		newAccount.deposit(3_000);
		
		newAccount.accountInfo();
	}
}
