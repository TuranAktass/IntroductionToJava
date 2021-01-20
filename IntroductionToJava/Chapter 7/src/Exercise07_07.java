public class Exercise07_07 {

	public static void main(String args[]) {
		int[] counts = new int[10];

		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 10);

			for (int j = 0; j < counts.length; j++) {
				if (j == num) {
					counts[j]++;
				}
			}
		}

		for (int i = 0; i < counts.length; i++) {

			System.out.printf("Number of %d's : %d \n", i, counts[i]);

		}
	}
}
