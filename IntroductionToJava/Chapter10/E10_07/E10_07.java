import java.util.Scanner;

public class E10_07 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		Account[] accounts = new Account[10];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account();

			accounts[i].setId(i);
			accounts[i].setBalance(100);
		}
		int id = getId(input);
		displayMenu(input, accounts, id);

		input.close();
	}

	public static int getId(Scanner input) {
		System.out.print("Enter an id : ");
		int id = input.nextInt();

		return id;
	}

	public static void displayMenu(Scanner input, Account[] accounts, int id) {
		System.out.println("Main Menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
		System.out.print("Enter a choice : ");
		int choice = input.nextInt();

		switch (choice) {
		case 1:
			System.out.println("The balance is " + accounts[id].getBalance());
			displayMenu(input, accounts, id);
			break;

		case 2:
			System.out.print("Enter an amount to withdraw : ");
			double wAmount = input.nextDouble();
			accounts[id].withdraw(wAmount);
			displayMenu(input, accounts, id);
			break;

		case 3:
			System.out.print("Enter an amount to deposit : ");
			double dAmount = input.nextDouble();
			accounts[id].deposit(dAmount);
			displayMenu(input, accounts, id);
			break;

		case 4:
			id = getId(input);
			displayMenu(input, accounts, id);
			break;

		default:
			System.out.println("Invalid input!");
			displayMenu(input, accounts, id);
			break;
		}
	}
}
