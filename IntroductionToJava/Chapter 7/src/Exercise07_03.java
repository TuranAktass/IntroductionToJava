import java.util.Scanner;

public class Exercise07_03 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		int[] counter = new int[101];

		System.out.println("Enter the integers between 1 and 100");

		int integer;

		do {
			integer = input.nextInt();
			counter[integer]++;
		} while (integer != 0);

		for (int i = 1; i <= 100; i++) {
			if (counter[i] > 0) {
				String output = i + " occurs " + counter[i];
				output += counter[i] > 1 ? " times" : " time";
				System.out.println(output);
			}
		}

		input.close();
	}

}
