import java.util.Scanner;

public class Exercise08_34 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 6 points");
		double[][] points = getPoints(input);

		double[] rightmostLowest = getRightmostLowestPoints(points);

		System.out.println("The rigmost lowest point is (" + rightmostLowest[0] + ", " + rightmostLowest[1] + ")");
	}

	public static double[] getRightmostLowestPoints(double[][] points) {
		boolean sorted;

		do {
			sorted = false;
			for (int i = 0; i < points.length - 1; i++) {
				if (points[i + 1][1] <= points[i][1]) {
					if (points[i + 1][0] < points[i][0]) {
						continue;
					}

					double[] temp = points[i + 1];
					points[i + 1] = points[i];
					points[i] = temp;

					sorted = true;
				}
			}
		} while (sorted);

		return points[0];
	}

	public static double[][] getPoints(Scanner input) {
		double[][] p = new double[6][2];

		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[0].length; j++) {
				p[i][j] = input.nextDouble();
			}
		}

		return p;
	}
}
