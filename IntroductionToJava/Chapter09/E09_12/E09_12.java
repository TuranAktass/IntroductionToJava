import java.util.Scanner;

public class E09_12 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4");
		double[][] points = new double[4][2];

		for (int i = 0; i < points.length; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}

		double a = points[0][1] - points[1][1];
		double b = -1 * (points[0][0] - points[1][0]);
		double c = points[2][1] - points[3][1];
		double d = -1 * (points[2][0] - points[3][0]);
		double e = a * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
		double f = c * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];

		LinearEquation eq = new LinearEquation(a, b, c, d, e, f);

		if (!eq.isSolvable()) {
			System.out.println("The two lines are parallel");
		} else {
			System.out.println("x : " + eq.getX() + "\n y : " + eq.getY());
		}

		input.close();
	}

}
