
public class E13_11 {

	public static void main(String args[]) throws CloneNotSupportedException {
		Octagon octagon1 = new Octagon(5);
		
		System.out.println("area: " + octagon1.getArea());
		System.out.println("perimeter: " + octagon1.getPerimeter());
		
		Octagon octagon2 = (Octagon)octagon1.clone();	

		if(octagon1.compareTo(octagon2) == 0) {
			System.out.println("octagon1 and octagon2 are equal");
		} else {
			System.out.println("octagon1 and octagon2 are not equal!");
		}
	}
}
