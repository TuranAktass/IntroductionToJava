import java.util.Scanner;

public class Exercise07_30 {

	public static void main(String args[]) {
		int[] values = getInput();

		boolean result = isConsecutiveFour(values);

		if (result)
			System.out.println("The list has consecutive fours!");
		else
			System.out.println("The list has no consecutive fours!");
	}

	public static boolean isConsecutiveFour(int[] values) {
		boolean consFour = false;

		if (values.length >= 4) {
			int currentCons = values[0];
			int counter = 1;

			for (int i = 1; i < values.length; i++) {
				if (values[i] == currentCons) {
					counter++;
				} else {
					currentCons = values[i];
					counter = 1;
				}

				if (counter == 4) {
					consFour = true;
					break;
				}
			}
		}

		return consFour;
	}

	public static int[] getInput() {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of values : ");
		int numberOfValues = input.nextInt();

		int[] array = new int[numberOfValues];

		System.out.println("Enter the values : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		input.close();

		return array;
	}
}
