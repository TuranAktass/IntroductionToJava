import java.util.Scanner;
import java.util.ArrayList;

public class E11_09 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> rows = new ArrayList<>();
		ArrayList<Integer> columns = new ArrayList<>();

		int[][] matrix = getInput(input);
		printMatrix(matrix);

		int maxOnesColumn = -1;
		int maxOnesRow = -1;
		int counter;

		for (int i = 0; i < matrix.length; i++) {
			counter = 0;

			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1) {
					counter++;
				}
			}

			if (counter > maxOnesRow) {
				maxOnesRow = counter;
			}
		}

		for (int j = 0; j < matrix[0].length; j++) {
			counter = 0;

			for (int i = 0; i < matrix.length; i++) {
				if (matrix[i][j] == 1) {
					counter++;
				}
			}

			if (counter > maxOnesColumn) {
				maxOnesColumn = counter;
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			counter = 0;

			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1) {
					counter++;
				}
			}

			if (counter == maxOnesRow) {
				rows.add(i);
			}
		}

		for (int j = 0; j < matrix[0].length; j++) {
			counter = 0;

			for (int i = 0; i < matrix.length; i++) {
				if (matrix[i][j] == 1) {
					counter++;
				}
			}

			if (maxOnesColumn == counter) {
				columns.add(j);
			}
		}

		System.out.println("The largest row index: " + rows.toString());
		System.out.println("The largest column index: " + columns.toString());

		input.close();
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}
	}

	public static int[][] getInput(Scanner input) {
		System.out.print("Enter the array size n: ");
		int size = input.nextInt();

		int[][] matrix = new int[size][size];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}

		return matrix;
	}
}
