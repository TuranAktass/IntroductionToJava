
public class E13_10 {

	public static void main(String args[]) {
		Rectangle rect1 = new Rectangle(10,20);
		Rectangle rect2 = new Rectangle(20,30);
		Rectangle rect3 = new Rectangle(10,20);
		
		System.out.println("rect1 equals to rect2: " + rect1.equals(rect2));
		System.out.println("rect2 equals to rect3: " + rect2.equals(rect3));
		System.out.println("rect3 equals to rect1: " + rect3.equals(rect1));
	}
}
