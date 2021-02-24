import java.util.Scanner;

public class Exercise08_31 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		double[][] points = new double[4][2];
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4 :");

		for (int i = 0; i < points.length; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}

		double[] intersectingPoint = getIntersectingPoint(points);

		if (intersectingPoint == null) {
			System.out.println("The two lines are parallel");
		} else {
			System.out.println(
					"The intersecting point is at (" + intersectingPoint[0] + "," + intersectingPoint[1] + ")");
		}

		input.close();
	}

	public static double[] getIntersectingPoint(double[][] points) {
		double a = points[0][1] - points[1][1];
		double b = -1 * (points[0][0] - points[1][0]);
		double c = points[2][1] - points[3][1];
		double d = -1 * (points[2][0] - points[3][0]);
		double e = a * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
		double f = c * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];

		double disc = a * d - b * c;

		if (disc == 0) {
			return null;
		}

		double x = (e * d - b * f) / disc;
		double y = (a * f - e * c) / disc;

		double[] intersectingPoint = new double[2];
		intersectingPoint[0] = x;
		intersectingPoint[1] = y;

		return intersectingPoint;
	}

}
