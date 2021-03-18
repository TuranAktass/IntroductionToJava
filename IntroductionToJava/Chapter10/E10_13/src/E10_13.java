public class E10_13 {

	public static void main(String args[]) {
		MyRectangle2D rec1 = new MyRectangle2D(2, 2, 5.5, 4.9);

		System.out.println("rec1's area : " + rec1.getArea());
		System.out.println("rec1's perimeter : " + rec1.getPerimeter());

		System.out.println("rec1.contains(3,3) : " + rec1.contains(3, 3));
		System.out.println(
				"rec1.contains(new MyRectangle(4,5,10.5,3.2)) : " + rec1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
		System.out.println(
				"rec1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4))" + rec1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
	}
}
