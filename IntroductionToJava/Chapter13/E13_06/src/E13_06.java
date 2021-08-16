
public class E13_06 {

	public static void main(String args[]) {
		ComparableCircle c1 = new ComparableCircle(12);
		ComparableCircle c2 = new ComparableCircle(16);
		
		if(c1.compareTo(c2) == 1) {
			System.out.println("c1 is larger");
		} else if(c1.compareTo(c2) == -1) {
			System.out.println("c2 is larger");
		} else {
			System.out.println("c1 and c2 are equal!");
		}
	}
}
