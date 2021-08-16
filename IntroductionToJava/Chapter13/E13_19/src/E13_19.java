import java.math.BigInteger;
import java.util.Scanner;

public class E13_19 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String n = "";

		do {
			System.out.println("Enter a decimal number: ");
			n = input.next();
		} while (!n.matches("\\-?\\d+\\.\\d+"));

		boolean negative = n.charAt(0) == '-';
		BigInteger[] components = parseInput(n);
		BigInteger denominator = components[2];
		BigInteger numerator = components[0].multiply(denominator).add(components[1]);
		Rational r = new Rational(numerator, denominator);

		System.out.println("The fraction number is: " + (negative ? "-" : "") + r);
	}

	public static BigInteger[] parseInput(String s) {
		String[] components = s.split("\\.");
		String denomString = "1";

		for (int i = 0; i < components[1].length(); i++) {
			denomString += "0";
		}

		BigInteger characteristic = new BigInteger(components[0]);
		BigInteger mantissa = new BigInteger(components[1]);
		BigInteger denominator = new BigInteger(denomString);

		BigInteger gcd = mantissa.gcd(denominator);

		mantissa = mantissa.divide(gcd);
		denominator = denominator.divide(gcd);

		return new BigInteger[] { characteristic, mantissa, denominator };

	}
}
