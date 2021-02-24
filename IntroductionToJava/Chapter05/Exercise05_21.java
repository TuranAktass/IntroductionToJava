import java.util.Scanner;

public class Exercise05_21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount : ");
		double loanAmount = input.nextDouble();
		System.out.print("Number of Years : ");
		int numberOfYears = input.nextInt();

		System.out.print("Interest Rate\t Monthly Payment	Total Payment");
		System.out.println();

		for (double iRate = 5.0; iRate <= 8.0; iRate += 0.125) {

			System.out.printf("%-5.3f", iRate);
			System.out.print("%           ");
			double monthlyInterestRate = iRate / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate
					/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			System.out.printf("%-19.2f", monthlyPayment);
			System.out.printf("%.2f\n", (monthlyPayment * 12) * numberOfYears);
		}

		input.close();

	}

}
