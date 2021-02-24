import java.util.Scanner;

public class Exercise07_17 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of students : ");
		int numberOfStudents = input.nextInt();

		String[] names = new String[numberOfStudents];
		int[] scores = new int[numberOfStudents];

		System.out.println("Enter the student's name and score : ");
		for (int i = 0; i < numberOfStudents; i++) {
			names[i] = input.next();
			scores[i] = input.nextInt();
		}

		sortDecreasing(names, scores);

		printArray(names, scores);

	}

	public static void sortDecreasing(String[] names, int[] scores) {
		boolean flag = true;

		while (flag) {
			flag = false;

			for (int i = 0; i < scores.length - 1; i++) {
				if (scores[i] < scores[i + 1]) {
					int temp = scores[i + 1];
					scores[i + 1] = scores[i];
					scores[i] = temp;

					String tempStr = names[i + 1];
					names[i + 1] = names[i];
					names[i] = tempStr;

					flag = true;
				}
			}
		}
	}

	public static void printArray(String[] names, int[] scores) {

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " -> " + scores[i]);
		}

	}

}
