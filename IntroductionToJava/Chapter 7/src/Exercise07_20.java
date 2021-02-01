import java.util.Scanner;

public class Exercise07_20 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		double[] numbers = new double[10];

		System.out.println("Enter ten double numbers :");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}

		selectionSort(numbers);
		printArray(numbers);

		input.close();
	}

	public static void selectionSort(double[] array) {
		int n = array.length - 1;

		while (n > 0) {
			double max = array[n];
			int maxIndex = n;

			for (int i = 0; i < n; i++) {
				if (array[i] > max) {
					max = array[i];
					maxIndex = i;
				}
			}

			if (max > array[n]) {
				double temp = array[n];
				array[n] = max;
				array[maxIndex] = temp;
			}

			n--;
		}
	}

	public static void printArray(double[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " - ");
		}
	}
}
