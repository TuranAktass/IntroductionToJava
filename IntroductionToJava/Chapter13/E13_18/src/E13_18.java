import java.math.BigInteger;
public class E13_18 {

	public static void main(String args[]) {
		Rational sum = new Rational();
		
		for(int i = 1; i <= 99; i++) {
			Rational rat = new Rational(BigInteger.valueOf(i), BigInteger.valueOf(i + 1));
			sum = sum.add(rat);
		}
		
		System.out.println("sum:" + sum);
	}
}
