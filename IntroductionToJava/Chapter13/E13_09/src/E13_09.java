
public class E13_09 {
	public static void main(String args[]) {
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(10);
		Circle c3 = new Circle(15);
		
		System.out.println("c1 equals c2: "+c1.equals(c2));
		System.out.println("c1 equals c3: "+ c1.equals(c3));
	}
}
