import java.util.Scanner;
import java.util.ArrayList;

public class E11_15 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		double area = getArea(input);

		System.out.println("The total area is : " + area);
	}

	public static double getArea(Scanner input) {
		ArrayList<ArrayList<Double>> points = getInput(input);

		double area = 0.0;

		int n = points.size();
		int j = n - 1;

		for (int i = 0; i < n; i++) {
			double x1 = points.get(j).get(0);
			double y1 = points.get(j).get(1);

			double x2 = points.get(i).get(0);
			double y2 = points.get(i).get(1);

			area += (x1 + x2) * (y1 - y2);

			j = i;
		}

		return Math.abs(area / 2.0);
	}

	public static ArrayList<ArrayList<Double>> getInput(Scanner input) {
		System.out.print("Enter the number of the points: ");
		int numberOfPoints = input.nextInt();

		System.out.println("Enter the coordinates of the points: ");
		ArrayList<ArrayList<Double>> points = new ArrayList<>();

		for (int i = 0; i < numberOfPoints; i++) {
			ArrayList<Double> point = new ArrayList<>();

			point.add(input.nextDouble());
			point.add(input.nextDouble());
			points.add(point);
		}

		return points;
	}
}
