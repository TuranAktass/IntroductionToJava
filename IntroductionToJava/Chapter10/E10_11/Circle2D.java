public class Circle2D {
	private double x;
	private double y;
	private double radius;
	
	public Circle2D() {
		this(0 , 0 , 1);
	}
	
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter() {
		return Math.PI * radius * 2;
	}
	
	public boolean contains(double a, double b) {
		double distance = Math.sqrt((a - x) *( a - x) + (b - y) * (b - y));
		
		return distance <= radius;
	}
	
	public boolean contains(Circle2D circle) {
		double a = circle.getX();
		double b = circle.getY();
		
		double distance = Math.sqrt((a - x) *( a - x) + (b - y) * (b - y));
		
		return distance + circle.getRadius() <= radius;
	}
	
	public boolean overlaps(Circle2D circle) {
		double a = circle.getX();
		double b = circle.getY();
		
		double distance = Math.sqrt((a - x) *( a - x) + (b - y) * (b - y));
		
		return distance <= (radius + circle.getRadius());
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRadius() {
		return radius;
	}
}
