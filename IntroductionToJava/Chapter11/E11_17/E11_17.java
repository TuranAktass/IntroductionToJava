import java.util.Scanner;
import java.util.ArrayList;

public class E11_17 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int integer = input.nextInt();

		System.out.println("factors(" + integer + ") : " + findFactors(integer).toString());
		System.out.println("The smallest number n for m * n to be a perfect square is " + findN(integer));
		System.out.println("m * n is " + integer * findN(integer));

		input.close();
	}

	public static ArrayList<Integer> findFactors(int number) {
		ArrayList<Integer> factors = new ArrayList<>();

		while (number % 2 == 0) {
			number /= 2;
			factors.add(2);
		}

		int factor = 3;
		for (int i = 0; i < number; i++) {
			if (number % factor == 0) {
				number /= factor;
				factors.add(factor);
			} else {
				factor += 2;
			}
		}

		return factors;
	}

	public static int findN(int number) {
		ArrayList<Integer> factors = findFactors(number);
		ArrayList<Integer> n = new ArrayList<Integer>();

		int product = 1;

		for (int i = 0; i < factors.size(); i++) {
			int currentFactor = factors.get(i);
			if (n.contains(currentFactor)) {
				continue;
			}

			int counter = 1;
			for (int j = i + 1; j < factors.size(); j++) {
				if (currentFactor == factors.get(j)) {
					counter++;
				}
			}

			if (counter % 2 != 0) {
				product *= currentFactor;
			}

			n.add(currentFactor);
		}

		return product;
	}

}
