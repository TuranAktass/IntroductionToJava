import java.util.Scanner;
import java.util.ArrayList;

public class E11_04 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = getInput(input);

		Integer maxValue = max(list);

		System.out.println("Maximum value in list is " + maxValue.toString());
	}

	public static Integer max(ArrayList<Integer> list) {
		int max = list.get(0);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}

		return max;
	}

	public static ArrayList<Integer> getInput(Scanner input) {
		System.out.println("Enter a list of integer (0 for exit)");

		ArrayList<Integer> list = new ArrayList<>();

		while (true) {
			int number = input.nextInt();

			if (number != 0) {
				list.add(number);
			} else {
				break;
			}

		}

		return list;
	}

}
