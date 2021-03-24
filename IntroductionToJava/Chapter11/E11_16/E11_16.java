import java.util.Scanner;
import java.util.ArrayList;

public class E11_16 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> answers = new ArrayList<>();

		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		int sum = number1 + number2;

		System.out.print(number1 + " + " + number2 + " = ?");
		int answer = input.nextInt();

		while (sum != answer) {
			if (answers.contains((Integer) answer)) {
				System.out.println("You already entered " + answer);
			}

			System.out.println("Wrong Answer! Try Again!");
			
			answer = input.nextInt();
			answers.add(answer);
		}

		System.out.println("You got it!");
		
		input.close();
	}
}
