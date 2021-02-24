import java.util.Scanner;

public class Exercise08_26 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		double[][] matrix = getMatrix(input, 3);
		double[][] sorted = sortRows(matrix);

		System.out.println("The row sorted array is : ");
		displayMatrix(sorted);

		input.close();
	}

	public static double[][] sortRows(double[][] m) {
		double[][] sortedMatrix = m;
		boolean sorted;

		do {
			sorted = false;

			for (int i = 0; i < sortedMatrix.length; i++) {
				for (int j = 0; j < sortedMatrix[0].length - 1; j++) {
					if (sortedMatrix[i][j] > sortedMatrix[i][j + 1]) {
						double temp = sortedMatrix[i][j];
						sortedMatrix[i][j] = sortedMatrix[i][j + 1];
						sortedMatrix[i][j + 1] = temp;
						sorted = true;
					}
				}
			}
		} while (sorted);

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
