import java.util.Scanner;

public class Exercise08_27 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		double[][] matrix = getMatrix(input, 3);
		double[][] sorted = sortColumns(matrix);

		System.out.println("The row sorted array is : ");
		displayMatrix(sorted);

		input.close();
	}

	public static double[][] sortColumns(double[][] m) {
		double[][] sortedMatrix = m;

		boolean sorted;

		for (int i = 0; i < sortedMatrix[0].length; i++) {
			do {
				sorted = false;
				for (int j = 0; j < sortedMatrix.length - 1; j++) {
					if (sortedMatrix[j][i] > sortedMatrix[j + 1][i]) {
						double temp = sortedMatrix[j][i];
						sortedMatrix[j][i] = sortedMatrix[j + 1][i];
						sortedMatrix[j + 1][i] = temp;
						sorted = true;
					}
				}

			} while (sorted);
		}

		return sortedMatrix;
	}

	public static double[][] getMatrix(Scanner input, int size) {
		double[][] m = new double[size][size];

		System.out.println("Enter a " + size + "-" + size + " matrix row-by-row");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}

		return m;
	}

	public static void displayMatrix(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

	}
}
