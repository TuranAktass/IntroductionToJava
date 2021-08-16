
public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{
	
	private double side;
	
	public Octagon() {
		
	}
	
	public Octagon(double side) {
		this.side = side;
	}
	
	public Octagon(double side, String color, boolean filled) {
		this.side = side;
		setColor(color);
		setFilled(filled);
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	@Override
	public int compareTo(Octagon o) {
		if(getArea() > o.getArea()) {
			return 1;
		} else if(getArea() < o.getArea()) {
			return -1;
		}
		
		return 0;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side * side * (2 + 4 / (Math.sqrt(2)));
	}

	@Override
	public double getPerimeter() {
		return 8 * side;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return (Octagon)super.clone();
	}
}
