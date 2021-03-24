import java.util.Scanner;
import java.util.ArrayList;

public class E11_12 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		ArrayList<Double> list = new ArrayList<>();

		System.out.println("Enter five double values: ");
		for (int i = 0; i < 5; i++) {
			list.add(input.nextDouble());
		}

		System.out.println("sum is: " + sum(list));

		input.close();
	}

	public static double sum(ArrayList<Double> list) {
		double sum = 0;

		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}

		return sum;
	}

}
