
public class Circle extends GeometricObject implements Comparable<Circle> {
	private double radius;

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public int compareTo(Circle o) {
		if (radius > o.getRadius()) {
			return 1;
		} else if (radius < o.getRadius()) {
			return -1;
		}
		return 0;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	@Override
	public String toString() {
		return super.toString() + "\nradius: " + radius;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Circle)) {
			return false;
		}
		return compareTo((Circle) o) == 0;
	}

}
