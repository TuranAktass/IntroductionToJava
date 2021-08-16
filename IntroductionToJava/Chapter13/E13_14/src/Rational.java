
public class Rational extends Number implements Comparable<Rational> {

	//private long numerator = 0;
	//private long denominator = 1;
	private long[] r = new long[2];

	public Rational() {
		this(0, 1);
	}

	public Rational(long numerator, long denominator) {
		long gcd = gcd(numerator, denominator);
		r[0] = numerator;
		r[1] = denominator;
	}

	// returns greates common divisor
	private static long gcd(long n, long d) {
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;

		for (int k = 1; k <= n1 && k <= n2; k++) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;
			}
		}

		return gcd;
	}

	public long getNumerator() {
		return r[0];
	}

	public long getDenominator() {
		return r[1];
	}

	public Rational add(Rational secondRational) {
		long n = getNumerator() * secondRational.getDenominator() + getDenominator()* secondRational.getNumerator();
		long d = getDenominator() * secondRational.getDenominator();

		return new Rational(n, d);
	}

	public Rational subtract(Rational secondRational) {
		long n = getNumerator() * secondRational.getDenominator() - getDenominator() * secondRational.getNumerator();
		long d = getDenominator() * secondRational.getDenominator();

		return new Rational(n, d);
	}

	public Rational multiply(Rational secondRational) {
		long n = getNumerator() * secondRational.getNumerator();
		long d = getDenominator() * secondRational.getDenominator();

		return new Rational(n, d);
	}

	public Rational divide(Rational secondRational) {
		long n = getNumerator() * secondRational.getDenominator();
		long d = getDenominator() * secondRational.getNumerator();

		return new Rational(n, d);
	}

	@Override
	public String toString() {
		if (getDenominator() == 1) {
			return getNumerator() + "";
		} else {
			return getNumerator() + "/" + getDenominator();
		}
	}

	@Override
	public boolean equals(Object o) {
		if ((this.subtract((Rational) (o))).getNumerator() == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int compareTo(Rational o) {
		if (this.subtract(o).getNumerator() > 0) {
			return 1;
		} else if (this.subtract(o).getNumerator() < 0) {
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
		return getNumerator() * 1.0 / getDenominator();
	}

}
