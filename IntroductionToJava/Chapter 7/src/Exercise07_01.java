import java.util.Scanner;

public class Exercise07_01 {

	public static void main(String args[]) {
		int[] grades = getScores();
		assignGrades(grades);

	}

	public static int maxScore(int[] array) {
		int max = array[0];

		for (int i = 0; i < array.length; i++) {

			if (array[i] > max)
				max = array[i];

		}

		return max;
	}

	public static int[] getScores() {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of students : ");
		int numberOfStudents = input.nextInt();

		int[] grades = new int[numberOfStudents];

		System.out.println("Enter " + numberOfStudents + " scores : ");
		for (int i = 0; i < grades.length; i++) {
			grades[i] = input.nextInt();
		}
		
		input.close();
		
		return grades;
	}

	public static void assignGrades(int[] array) {
		int max = maxScore(array);

		String[] letterNote = new String[array.length];

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= max - 10)
				letterNote[i] = "A";

			else if (array[i] >= max - 20)
				letterNote[i] = "B";

			else if (array[i] >= max - 30)
				letterNote[i] = "C";

			else if (array[i] >= max - 40)
				letterNote[i] = "D";

			else
				letterNote[i] = "F";
		}

		for (int i = 0; i < array.length; i++) {
			System.out.printf("Student %d score is %d and grade is %c \n", i, array[i], letterNote[i].charAt(0));
		}

	}

}
