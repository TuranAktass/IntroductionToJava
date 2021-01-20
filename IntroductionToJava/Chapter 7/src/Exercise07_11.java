import java.util.Scanner;

public class Exercise07_11 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		double[] array = new double[10];

		System.out.println("Enter ten double values : ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();

		}

		System.out.printf("The mean is %.2f" + mean(array));
		System.out.printf("The standard deviation is %.5f" + deviation(array));

		input.close();
	}

	public static double deviation(double[] x) {
		double deviation = 0.0;

		double mean = mean(x);

		for (int i = 0; i < x.length; i++) {
			deviation += Math.pow((double) (x[i] - mean), 2);
		}

		deviation = Math.sqrt(deviation / (x.length - 1));

		return deviation;
	}

	public static double mean(double[] x) {
		double mean = 0;

		for (int i = 0; i < x.length; i++) {
			mean += x[i];
		}

		mean /= x.length;

		return mean;
	}
}
