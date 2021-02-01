import java.util.Scanner;

public class Exercise07_19 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter list : ");
		int arrayLength = input.nextInt();

		int[] array = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			array[i] = input.nextInt();
		}

		boolean result = isSorted(array);

		if (result)
			System.out.println("The list is already sorted!");
		else
			System.out.println("The list is not sorted!");

		input.close();
	}

	public static boolean isSorted(int[] array) {
		boolean sorted = true;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1])
				sorted = false;
		}

		return sorted;
	}
}
