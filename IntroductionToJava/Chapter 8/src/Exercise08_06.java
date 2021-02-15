import java.util.Scanner;

public class Exercise08_06 {

	public static void main(String args[]) {
		double[][] m1 = getMatrix(3, 3);
		double[][] m2 = getMatrix(3, 3);

		displayMatrix(m1);
		System.out.println("*");
		displayMatrix(m2);
		System.out.println("=");

		displayMatrix(multiplyMatrix(m1, m2));
	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {

		if (a[0].length != b.length) {
			System.out.println("Incorrect input!");
			return null;
		}

		double[][] c = new double[a.length][b[0].length];

		for (int i = 0; i < a.length; i++) {
			int resCol = 0;
			for (int j = 0; j < b[i].length; j++) {
				double sum = 0.0;

				for (int k = 0; k < c[0].length; k++) {
					sum += a[i][k] * b[k][j];
				}
				c[i][resCol] = sum;
				resCol++;
			}
		}

		return c;
	}

	public static double[][] getMatrix(int row, int col) {
		Scanner input = new Scanner(System.in);

		double[][] matrix = new double[row][col];

		System.out.println("Enter matrix : ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}

		return matrix;
	}

	public static void displayMatrix(double[][] m) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.printf("%.1f ", m[i][j]);
			}

			System.out.println();
		}
	}

}
