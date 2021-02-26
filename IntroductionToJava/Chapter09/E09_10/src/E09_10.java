import java.util.Scanner;

public class E09_10 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a , b and c:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		QuadraticEquation eq1 = new QuadraticEquation(a, b, c);

		if (eq1.getDiscriminant() < 0) {
			System.out.println("The equation has no roots.");
		} else if (eq1.getDiscriminant() == 0) {
			System.out.println("Root : " + eq1.getRoot1());
		} else {
			System.out.println("Root1 : " + eq1.getRoot1() + "\nRoot2 : " + eq1.getRoot2());
		}

		input.close();
	}
}
