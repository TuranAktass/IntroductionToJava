import java.util.Scanner;

public class Exercise07_09 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		double[] doubles = new double[10];

		System.out.println("Enter ten double values : ");

		for (int i = 0; i < 10; i++) {
			doubles[i] = input.nextDouble();
		}

		System.out.println("The min value : " + minValue(doubles));

		input.close();
	}

	public static double minValue(double[] array) {
		double min = array[0];

		for (int i = 0; i < array.length; i++) {

			if (array[i] < min) {
				min = array[i];
			}
		}

		return min;
	}

}
