
public class E13_05 {

	public static void main(String args[]) {
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(5);
		
		Circle largerCircle = (Circle)GeometricObject.max(c1, c2);
		
		System.out.println("The larger circles area is: " + largerCircle.getArea());
	
		Rectangle r1 = new Rectangle(5,10);
		Rectangle r2 = new Rectangle(10,10);
		
		Rectangle largerRectangle = (Rectangle)GeometricObject.max(r1, r2);
		
		System.out.println("The larger rectangles area is: " + largerRectangle.getArea());
	}
}
