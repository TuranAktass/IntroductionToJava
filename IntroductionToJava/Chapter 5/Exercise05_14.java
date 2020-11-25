import java.util.Scanner;

public class Exercise05_14 {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer : ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer : ");
		int n2 = input.nextInt();

		int gcd = 0;

		if (n1 < n2)
			gcd = n1;
		else if (n2 < n1)
			gcd = n2;

		while (true) {

			if (n1 % gcd == 0 && n2 % gcd == 0)
				break;
			gcd--;
		}

		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);

		input.close();
	}

}
