import java.util.Scanner;

public class Exercise08_25 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		double[][] matrix = getMatrix(input, 3);

		displayMatrix(matrix);

		String isMarkov = (isMarkovMatrix(matrix)) ? "It is a Markov Matrix " : "It is not a Markov Matrix";

		System.out.println(isMarkov);
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

	public static boolean isMarkovMatrix(double[][] m) {
		boolean isMarkov = true;
		double columnSum;

		for (int i = 0; i < m[0].length; i++) {
			columnSum = 0.0;
			for (int j = 0; j < m.length; j++) {
				if (m[j][i] < 0) {
					isMarkov = false;
				}

				columnSum += m[j][i];
			}

			if (columnSum != 1.0) {
				isMarkov = false;
			}
		}

		return isMarkov;
	}
}
