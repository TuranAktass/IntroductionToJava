
public class Square extends GeometricObject implements Colorable{
	
	private double side;
	
	public Square() {
		
	}
	
	public Square(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide (double side) {
		this.side = side;
	}
	
	@Override
	public void howToColor() {
		System.out.println("Color all four sides!");
	}
	
	@Override
	public double getArea() {
		return side * side;
	}

	@Override
	public double getPerimeter() {
		return 2*(side);
	}

}
