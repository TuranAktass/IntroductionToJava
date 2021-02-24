import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_15 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		int[] array = new int[10];

		System.out.println("Enter ten numbers : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		printArray(array);

		System.out.println("\nEliminate Duplicates : ");
		printArray(eliminateDuplicates(array));

		input.close();
	}

	public static int[] eliminateDuplicates(int[] list) {
		int[] array = new int[list.length];

		int counter = 0;

		for (int i = 0; i < list.length; i++) {
			boolean flag = true;

			for (int j = 0; j <= counter; j++) {
				if (list[i] == array[j]) {
					flag = false;
					break;
				}
			}

			if (flag) {
				array[counter] = list[i];
				counter++;
			}
		}

		return Arrays.copyOf(array, counter);
	}

	public static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " - ");
		}

	}
}
