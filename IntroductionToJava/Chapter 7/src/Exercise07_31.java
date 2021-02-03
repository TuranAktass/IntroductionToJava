import java.util.Scanner;

public class Exercise07_31 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter list1 :");
		int lList1 = input.nextInt();
		int[] list1 = new int[lList1];

		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}

		System.out.println("Enter list2 : ");
		int lList2 = input.nextInt();
		int[] list2 = new int[lList2];

		for (int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}

		int[] merged = merge(list1, list2);
		printArray(merged);

		input.close();
	}

	public static int[] merge(int[] list1, int[] list2) {
		int[] merged = new int[list1.length + list2.length];

		for (int i = 0; i < list1.length; i++) {
			merged[i] = list1[i];
		}

		for (int i = list1.length, j = 0; i < merged.length; i++, j++) {
			merged[i] = list2[j];
		}

		sort(merged);
		return merged;
	}

	public static void sort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int min = list[i];
			int minIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < min) {
					min = list[j];
					minIndex = j;
				}
			}

			if (minIndex != i) {
				list[minIndex] = list[i];
				list[i] = min;
			}
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
