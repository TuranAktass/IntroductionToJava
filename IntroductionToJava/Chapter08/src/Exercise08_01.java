import java.util.Scanner;

public class Exercise08_01 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		double[][] matrix = new double[3][4];
		System.out.println("Enter a 3-by-4 matrix in row by row:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}

		for (int i = 0; i < 4; i++) {
			System.out.println("Sum of elements at column " + i + " is " + sumColumn(matrix, i));
		}

		input.close();
	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0.0;

		for (int i = 0; i < 3; i++) {
			sum += m[i][columnIndex];
		}

		return sum;
	}

}
