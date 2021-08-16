import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {

	private static final BigInteger ZERO = new BigInteger("0");
	private static final BigInteger ONE = new BigInteger("1");
	
	private BigInteger numerator = ZERO;
	private BigInteger denominator = ONE;
	

	public Rational() {
		this(ZERO,ONE);
	}

	public Rational(BigInteger numerator, BigInteger denominator) {
		BigInteger gcd = gcd(numerator, denominator);
		this.numerator = numerator;
		this.denominator = denominator;
	}

	// returns greates common divisor
	private static BigInteger gcd(BigInteger n, BigInteger d) {
		BigInteger n1 = n.abs();
		BigInteger n2 = d.abs();
		BigInteger gcd = ONE;

		for(BigInteger k = ONE;
				(k.compareTo(n1) == -1 || k.equals(n1)) && 
				(k.compareTo(n2) == -1 || k.equals(n2));
				k = k.add(ONE)) {
			if(n1.remainder(k).equals(ZERO) && n2.remainder(k).equals(ZERO)) {
				gcd = k;
			}
		}

		return gcd;
	}

	public BigInteger getNumerator() {
		return numerator;
	}

	public BigInteger getDenominator() {
		return denominator;
	}

	public Rational add(Rational secondRational) {
		BigInteger n = (getNumerator().multiply(secondRational.getDenominator())).add((getDenominator().multiply(secondRational.getNumerator())));
		BigInteger d = getDenominator().multiply(secondRational.getDenominator());

		return new Rational(n, d);
	}

	public Rational subtract(Rational secondRational) {
		BigInteger n = (getNumerator().multiply(secondRational.getDenominator())).subtract((getDenominator().multiply(secondRational.getNumerator())));
		BigInteger d = getDenominator().multiply(secondRational.getDenominator());

		return new Rational(n, d);
	}

	public Rational multiply(Rational secondRational) {
		BigInteger n = getNumerator().multiply(secondRational.getNumerator());
		BigInteger d = getDenominator().multiply(secondRational.getDenominator());

		return new Rational(n, d);
	}

	public Rational divide(Rational secondRational) {
		BigInteger n = getNumerator().multiply(secondRational.getDenominator());
		BigInteger d = getDenominator().multiply(secondRational.getNumerator());

		return new Rational(n, d);
	}

	@Override
	public String toString() {
		if (getDenominator() == ONE) {
			return getNumerator() + "";
		} else {
			return getNumerator() + "/" + getDenominator();
		}
	}

	@Override
	public boolean equals(Object o) {
		if ((this.subtract((Rational) (o))).getNumerator().equals(ZERO)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int compareTo(Rational o) {
		if (this.subtract(o).getNumerator().compareTo(ZERO) == 1) {
			return 1;
		} else if (this.subtract(o).getNumerator().compareTo(ZERO) == -1) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public int intValue() {
		return (int) doubleValue();
	}

	@Override
	public long longValue() {
		return (long) doubleValue();
	}

	@Override
	public float floatValue() {
		return (float) doubleValue();
	}

	@Override
	public double doubleValue() {
		return getNumerator().doubleValue() / getDenominator().doubleValue();
	}

}
