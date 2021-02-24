import java.util.Scanner;

public class Exercise05_09 {
	/*
	 * (Find the two highest scores) Write a program that prompts the user to enter
	 * the number of students and each student’s name and score, and finally
	 * displays the student with the highest score and the student with the
	 * second-highest score.
	 */
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		String firstStudent = " ";
		String secondStudent = " ";
		int highest = 0;
		int secondHighest = 0;

		System.out.print("Enter number of students : ");
		int numberOfStudents = input.nextInt();

		String[] studentNames = new String[numberOfStudents];
		int[] studentScores = new int[numberOfStudents];

		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print("Enter students name : ");
			studentNames[i] = input.next();
			System.out.print("Enter students score : ");
			studentScores[i] = input.nextInt();
		}

		for (int i = 0; i < numberOfStudents; i++) {

			if (studentScores[i] > highest) {
				firstStudent = studentNames[i];
				highest = studentScores[i];
			}
			if (studentScores[i] > secondHighest && studentScores[i] < highest) {
				secondStudent = studentNames[i];
				secondHighest = studentScores[i];
			}
		}

		System.out.println("Highest Score : " + firstStudent + " --- " + highest);
		System.out.println("Second Highest Score : " + secondStudent + " --- " + secondHighest);

		input.close();
	}

}
