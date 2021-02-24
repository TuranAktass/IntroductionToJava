import java.util.Scanner;

public class Exercise08_32 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double[][] points = new double[3][2];

		System.out.println("Enter x1, y1, x2, y2, x3, y3: ");

		for (int i = 0; i < points.length; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}

		String outcome = (getTriangleArea(points) == 0) ? "The three points are on the same line!"
				: "The area of the triangle is " + getTriangleArea(points);

		System.out.println(outcome);

		input.close();
	}

	public static double getTriangleArea(double[][] points) {

		boolean sameLine = ((points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) - (points[2][0] - points[0][0]) * (points[1][1] - points[0][1])) == 0;

		if (sameLine) {
			return 0;
		}

		double side1 = Math.pow(Math.pow(points[1][0] - points[0][0], 2) + Math.pow(points[1][1] - points[0][1], 2), 0.5);
		double side2 = Math.pow(Math.pow(points[2][0] - points[0][0], 2) + Math.pow(points[2][1] - points[0][1], 2), 0.5);
		double side3 = Math.pow(Math.pow(points[2][0] - points[1][0], 2) + Math.pow(points[2][1] - points[1][1], 2), 0.5);

		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		return area;
	}

}
