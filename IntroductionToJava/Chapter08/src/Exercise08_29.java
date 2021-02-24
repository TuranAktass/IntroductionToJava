import java.util.Scanner;

public class Exercise08_29 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter list1 : ");
		int[][] list1 = getMatrix(input, 3);
		System.out.println("Enter list2 : ");
		int[][] list2 = getMatrix(input, 3);

		String isEqual = (equals(list1, list2)) ? "The two arrays are identical"
				: "The two arrays are not identical";

		System.out.println(isEqual);

		input.close();
	}

	public static boolean equals(int[][] m1, int[][] m2) {
		boolean isEqual = true;
		sortRows(m1);
		sortRows(m2);

		if (m1.length != m2.length || m1[0].length != m2[0].length) {
			isEqual = false;
		}

		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				if (m1[i][j] != m2[i][j]) {
					isEqual = false;
				}
			}
		}

		return isEqual;
	}

	public static void sortRows(int[][] m) {
		boolean sorted;

		do {
			sorted = false;

			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[0].length - 1; j++) {
					if (m[i][j] > m[i][j + 1]) {
						int temp = m[i][j];
						m[i][j] = m[i][j + 1];
						m[i][j + 1] = temp;
						sorted = true;
					}
				}
			}
		} while (sorted);

	}

	public static int[][] getMatrix(Scanner input, int size) {
		int[][] m = new int[size][size];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j] = input.nextInt();
			}
		}

		return m;
	}

	public static void displayMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

	}
}
