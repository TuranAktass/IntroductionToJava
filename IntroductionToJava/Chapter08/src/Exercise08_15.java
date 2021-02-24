import java.util.Scanner;

public class Exercise08_15 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		double[][] points = new double[5][2];

		System.out.println("Enter five points : ");

		for (int i = 0; i < 5; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}
		
		if(sameLine(points)) {
			System.out.println("The five points are on the same line");
		}
		else {
			System.out.println("The five points are not on the same line");
		}
	}

	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {

		return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) == 0;
	}

	public static boolean sameLine(double[][] points) {
		boolean sameLine = true;

		for (int i = 0; i < points.length - 2; i++) {
			if (!onTheSameLine(points[i][0], points[i][1], 
					points[i + 1][0], points[i + 1][1], 
					points[i + 2][0],	points[i + 2][1])) {
				sameLine = false;
				break;
			}
		}
		
		return sameLine;
	}
}