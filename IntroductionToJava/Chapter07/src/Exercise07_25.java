import java.util.Scanner;

public class Exercise07_25 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		double[] eqn = new double[3];
		double[] roots = new double[2];

		System.out.println("Enter a,b,c : ");
		eqn[0] = input.nextInt();
		eqn[1] = input.nextInt();
		eqn[2] = input.nextInt();

		int numberOfRoots = solveQuadratic(eqn, roots);

		System.out.println("Number of Roots : " + numberOfRoots);

		input.close();
	}

	public static int solveQuadratic(double[] eqn, double[] roots) {
		double a = eqn[0];
		double b = eqn[1];
		double c = eqn[2];

		double disc = (b * b) - (4 * a * c);

		if (disc < 0)
			return 0;
		else if (disc == 0) {
			roots[0] = ((-b + Math.sqrt(disc)) / (2 * a));

			System.out.println("Root 1 : " + roots[0]);

			return 1;
		} else {
			roots[0] = ((-b + Math.sqrt(disc)) / (2 * a));
			roots[1] = ((-b - Math.sqrt(disc)) / (2 * a));

			System.out.println("Root 1 : " + roots[0]);
			System.out.println("Root 2 : " + roots[1]);

			return 2;
		}
	}

}
