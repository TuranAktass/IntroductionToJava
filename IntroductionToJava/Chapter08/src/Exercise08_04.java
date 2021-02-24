public class Exercise08_04 {

	public static void main(String args[]) {
		int[][] hours = { 
				{ 2, 4, 3, 4, 5, 8, 8 }, 
				{ 7, 3, 4, 3, 3, 4, 4 }, 
				{ 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, 
				{ 3, 5, 4, 3, 6, 3, 8 }, 
				{ 3, 4, 4, 6, 3, 4, 4 }, 
				{ 3, 7, 4, 8, 3, 8, 4 },
				{ 6, 3, 5, 9, 2, 7, 9 } };
		
		int[][] sum = rowSum(hours);
		sort(sum);

		for (int i = 0; i < hours.length; i++) {
			System.out.println("Employee " + sum[i][0] + ": " + sum[i][1]);
		}

	}

	public static int[][] rowSum(int[][] m) {
		int[][] totalHours = new int[m.length][2];

		for (int i = 0; i < m.length; i++) {
			int sum = 0;

			for (int j = 0; j < m[0].length; j++) {
				sum += m[i][j];
			}

			totalHours[i][0] = i;
			totalHours[i][1] = sum;
		}

		return totalHours;
	}

	public static void sort(int[][] m) {
		boolean sorted;

		do {
			sorted = false;

			for (int i = 0; i < m.length - 1; i++) {
				if (m[i][1] < m[i + 1][1]) {
					int[] temp = m[i];
					m[i] = m[i + 1];
					m[i + 1] = temp;

					sorted = true;
				}
			}
		} while (sorted);
	}
}
