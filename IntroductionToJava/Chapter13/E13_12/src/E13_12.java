
public class E13_12 {

	public static void main(String args[]) {
		Circle c1 = new Circle(10); //area: 314
		Circle c2 = new Circle(20);//area: 1256
		
		Rectangle r1 = new Rectangle(10,20); //area: 200
		Rectangle r2 = new Rectangle(30,40); //area: 1200
		
		GeometricObject[] array = {c1,c2,r1,r2};
		
		System.out.println("Sum: " + sumArea(array));
	}
	
	public static double sumArea(GeometricObject [] a) {
		double sum = 0.0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i].getArea();
		}
		
		return sum;
	}
}

