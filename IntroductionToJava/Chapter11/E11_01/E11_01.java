import java.util.Scanner;
public class E11_01 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		double[] sides = new double[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter side" + (i + 1) + ": ");
			sides[i] = input.nextDouble();
		}

		Triangle t1 = new Triangle(sides[0], sides[1], sides[2]);

		System.out.print("Enter a color: ");
		t1.setColor(input.next());

		System.out.print("Enter filled (1 for true, and -1 for false) : ");
		int isFilled = input.nextInt();

		if (isFilled == 1) {
			t1.setFilled(true);
		} else if (isFilled == -1) {
			t1.setFilled(false);
		} else {
			System.out.println("Invalid input!");
		}

		System.out.println("area: " + t1.getArea());
		System.out.println("perimeter: " + t1.getPerimeter());
		System.out.println("color: " + t1.getColor());
		System.out.println("filled: " + t1.isFilled());

		input.close();
	}
}
