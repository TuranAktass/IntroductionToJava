import java.util.Scanner;

public class Exercise07_27 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first array : ");
		int list1Size = input.nextInt();

		int[] list1 = new int[list1Size];

		for (int i = 0; i < list1Size; i++) {
			list1[i] = input.nextInt();
		}

		System.out.println("Enter second array : ");
		int list2Size = input.nextInt();

		int[] list2 = new int[list2Size];

		for (int i = 0; i < list2Size; i++) {
			list2[i] = input.nextInt();
		}

		if (equals(list1, list2) == true) {
			System.out.println("Two lists are identical");
		}

		else if (equals(list1, list2) == false) {
			System.out.println("Two lists are not identical");
		}

		input.close();
	}

	public static boolean equals(int[] list1, int[] list2) {
		selectionSort(list1);
		selectionSort(list2);

		boolean isIdentical = true;

		if (list1.length != list2.length)
			isIdentical = false;

		for (int i = 0; i < list1.length; i++) {
			if (list1[i] != list2[i])
				isIdentical = false;
		}

		return isIdentical;
	}

	public static void selectionSort(int[] array) {
		int n = array.length - 1;

		while (n > 0) {
			int max = array[n];
			int maxIndex = n;

			for (int i = 0; i < n; i++) {
				if (array[i] > max) {
					max = array[i];
					maxIndex = i;
				}
			}

			if (max > array[n]) {
				int temp = array[n];
				array[n] = max;
				array[maxIndex] = temp;
			}

			n--;
		}
	}
}