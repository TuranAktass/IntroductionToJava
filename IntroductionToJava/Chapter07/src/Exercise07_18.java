import java.util.Scanner;

public class Exercise07_18 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		double[] numbers = new double[10];

		System.out.println("Enter ten doubles : ");
		for (int i = 0; i < 4; i++) {
			numbers[i] = input.nextDouble();
		}

		bubbleSort(numbers);

		printArray(numbers);

		input.close();
	}

	public static void bubbleSort(double[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					double temp;
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void printArray(double[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " - ");
		}
	}
}
