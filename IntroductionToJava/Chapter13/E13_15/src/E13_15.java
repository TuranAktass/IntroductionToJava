import java.math.BigInteger;

public class E13_15 {

	public static void main(String args[]) {
		Rational r1 = new Rational(new BigInteger("1"), new BigInteger("10"));
		Rational r2 = new Rational(new BigInteger("2"), new BigInteger("10"));
		
		System.out.println("r1 + r2 = " + r1.add(r2));
		System.out.println("r1 - r2 = " + r1.subtract(r2));
		System.out.println("r1 * r2 = " + r1.multiply(r2));
		System.out.println("r1 / r2 = " + r1.divide(r2));
	}
}
