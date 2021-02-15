import java.util.Scanner;

public class Exercise08_05 {

	public static void main(String args[]) {
		double[][] m1 = getMatrix(3, 3);
		double[][] m2 = getMatrix(3, 3);

		displayMatrix(m1);
		System.out.println("+");
		displayMatrix(m2);
		System.out.println("=");

		displayMatrix(addMatrix(m1, m2));
	}

	public static double[][] addMatrix(double[][] a, double[][] b) {

		if (a.length != b.length && a[0].length != b[0].length) {
			System.out.println("Two matrices must have the same dimensions!");
			return null;
		}

		double[][] sum = new double[a.length][a[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}

		return sum;
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
				System.out.print(m[i][j] + " ");
			}

			System.out.println();
		}
	}

}
