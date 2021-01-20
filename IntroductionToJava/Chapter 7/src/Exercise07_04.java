import java.util.Scanner;

public class Exercise07_04 {
	/*
	 * (Analyze scores) Write a program that reads an unspecified number of scores
	 * and determines how many scores are above or equal to the average and how many
	 * scores are below the average. Enter a negative number to signify the end of
	 * the input. Assume that the maximum number of scores is 100.
	 */
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		int scores[] = new int[100];
		int average = 0;
		int counter = 0;

		System.out.println("Enter scores : (-1 for exit) : ");

		for (int i = 0; i < scores.length; i++) {
			int entry = input.nextInt();

			if (entry == -1)
				break;

			else {
				scores[i] = entry;
				average += scores[i];
				counter++;
			}
		}

		average = average / counter;

		int above = 0;
		int below = 0;

		for (int i = 0; i < counter; i++) {
			if (scores[i] >= average)
				above++;

			else
				below++;
		}

		System.out.println("Average of scores : " + average);
		System.out.println("Number of scores above or equal to average : " + above);
		System.out.println("Number of scores below to average : " + below);

		input.close();
	}
}
