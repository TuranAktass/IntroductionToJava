import java.util.ArrayList;

public class E13_07 {

	public static void main(String args[]) {
		
		ArrayList<GeometricObject> list = new ArrayList<>();
		
		list.add(new Square(5));
		list.add(new Square(25));
		list.add(new Square(30));
		list.add(new Square(20));
		list.add(new Square(10));
		
		for(GeometricObject o: list) {
			((Colorable)o).howToColor();
		}
		
	}
}
