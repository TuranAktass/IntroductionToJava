public class E09_01 {

	public static void main(String args[]) {
		Rectangle rec1 = new Rectangle(4, 40);
		Rectangle rec2 = new Rectangle(3.5, 35.9);

		System.out.println("Rectangle 1 : \nwidth : " + rec1.width + "\nheight : " + rec1.height + "\narea : "
				+ rec1.getArea() + "\nperimeter : " + rec1.getPerimeter());

		System.out.println("__________________\n");

		System.out.println("Rectangle 2 : \nwidth : " + rec2.width + "\nheight : " + rec2.height + "\narea : "
				+ rec2.getArea() + "\nperimeter : " + rec2.getPerimeter());

	}
}
