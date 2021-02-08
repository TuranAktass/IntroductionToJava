
public class Exercise08_03 {

	public static void main(String[] args) {
		char[][] answers = { { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
				{ 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
				{ 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
				{ 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };

		char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
		int[] correctAnswers = new int[keys.length];

		for (int i = 0; i < answers.length; i++) {
			int correctCount = 0;
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == keys[j])
					correctCount++;
			}
			correctAnswers[i] = correctCount;

			System.out.println("Student " + i + "'s correct count is " + correctAnswers[i]);
		}

		int[] students = { 0, 1, 2, 3, 4, 5, 6, 7 };
		int n = students.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (correctAnswers[j] > correctAnswers[j + 1]) {
					int temp = correctAnswers[j];
					correctAnswers[j] = correctAnswers[j + 1];
					correctAnswers[j + 1] = temp;

					int tempS = students[j];
					students[j] = students[j + 1];
					students[j + 1] = tempS;
				}
			}
		}
		System.out.println("_________________________-");
		for (int i = 0; i < students.length; i++) {
			System.out.println("Student " + students[i] + "'s correct count is " + correctAnswers[i]);
		}
	}

}