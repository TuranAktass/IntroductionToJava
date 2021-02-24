import java.util.Scanner;

public class Exercise08_30 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a00 , a01, a10, a11 : ");
		double[][] a = new double[2][2];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = input.nextDouble();
			}
		}

		System.out.print("Enter b0 and b1 : ");
		double[] b = new double[2];
		for (int i = 0; i < b.length; i++) {
			b[i] = input.nextDouble();
		}

		double[] result = linearEquation(a, b);

		if (result == null) {
			System.out.println("The equation has no solution!");
		} else {
			System.out.println("x is " + result[0] + " and y is " + result[1]);
		}
		
		input.close();
	}

	public static double[] linearEquation(double[][] a, double[] b) {
		double [] result = new double [2];
		
		if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0) {
			return null;
		}

		double x = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
		double y = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
		
		result[0] = x ; result[1] = y;
		return result;
	}
}
