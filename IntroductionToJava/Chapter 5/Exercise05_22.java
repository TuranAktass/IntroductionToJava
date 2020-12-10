import java.util.Scanner;

public class Exercise05_22 {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		System.out.print("Loan Amount : ");
		double loanAmount = input.nextDouble();
		System.out.print("Number of Years : ");
		int numberOfYears = input.nextInt();
		System.out.print("Annual Interest Rate : ");
		double ınterestRate = input.nextDouble();

		double monthlyRate = ınterestRate / 1200.0;
		double monthlyPayment = loanAmount * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, numberOfYears * 12));

		System.out.println("Payment   Interest    Principal    Balance");

		for (int i = 1; i <= numberOfYears * 12; i++) {
			double interest = monthlyRate * loanAmount;
			double principal = monthlyPayment - interest;
			loanAmount -= principal;
			System.out.printf("%-8d    %-8.2f    %-9.2f    %-7.2f\n", i, interest, principal, loanAmount);
		}

		input.close();
		
	}

}
