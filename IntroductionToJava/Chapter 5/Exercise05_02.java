import java.util.Scanner;

public class Exercise05_02 {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		final int NUMBER_OF_QUESTIONS = 10;
		int correctCount = 0;
		int count = 0;
		long startTime = System.currentTimeMillis();
		String output = " ";

		while (count < NUMBER_OF_QUESTIONS) {
			int number1 = (int) (1 + Math.random() * 15);
			int number2 = (int) (1 + Math.random() * 15);

			System.out.print("What is " + number1 + " + " + number2 + "? ");
			int answer = input.nextInt();

			if (number1 + number2 == answer) {
				System.out.println("Your answer is correct!");
				correctCount++;
			} else {
				System.out.println("Your answer is wrong!");
				System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
			}

			count++;

			output += "\n" + number1 + " + " + number2 + " = " + answer
					+ ((number1 + number2 == answer) ? " correct" : " wrong");
		}

		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;

		System.out.println(
				"Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);

		input.close();
	}

}
