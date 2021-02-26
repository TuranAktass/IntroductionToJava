public class E09_09 {

	public static void main(String args[]) {
		RegularPolygon rp1 = new RegularPolygon();
		RegularPolygon rp2 = new RegularPolygon(6, 4);
		RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);
		RegularPolygon rp4 = new RegularPolygon(4 , 4);
	
		System.out.println("Polygon 1's perimeter : " + rp1.getPerimeter());
		System.out.println("Polygon 1's area : " + rp1.getArea());
		
		System.out.println("Polygon 2's perimeter : " + rp2.getPerimeter());
		System.out.println("Polygon 2's area : " + rp2.getArea());
		
		System.out.println("Polygon 3's perimeter : " + rp3.getPerimeter());
		System.out.println("Polygon 3's area : " + rp3.getArea());
	}
}
