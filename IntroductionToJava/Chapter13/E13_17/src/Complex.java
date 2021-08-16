
public class Complex implements Cloneable {
	private double a; // real part
	private double b; // imaginary part

	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public Complex() {
		this(0, 0);
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public Complex add(Complex c) {
		double a = (getA() + c.getA());
		double b = (getB() + c.getB());

		return new Complex(a, b);
	}

	public Complex subtract(Complex c) {
		double a = (getA() - c.getA());
		double b = (getB() - c.getB());

		return new Complex(a, b);
	}

	public Complex multiply(Complex c) {
		double a = (getA() * c.getA()) - (getB() * c.getB());
		double b = (getB() * c.getA()) + (getA() * c.getB());

		return new Complex(a, b);
	}

	public Complex divide(Complex c) {
		double a = (getA() * c.getA() + getB() * c.getB()) / (c.getA() * c.getA() + c.getB() * c.getB());
		double b = (getB() * c.getA() - getA() * c.getB()) / (c.getA() * c.getA() + c.getB() * c.getB());

		return new Complex(a, b);
	}

	public double abs() {
		return Math.sqrt(a * a + b * b);
	}

	@Override
	public String toString() {
		if (b > 0 || b < 0) {
			return a + " + " + b + "i";
		}

		return a + "";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return (Complex) super.clone();
	}
}
