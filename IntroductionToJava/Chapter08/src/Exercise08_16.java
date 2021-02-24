
public class Exercise08_16 {

	public static void main(String args[]) {
		int[][] m = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };
		
		sort(m);
		display2DArray(m);
	}
	
	public static void display2DArray(int [][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	public static void sort(int m[][]) {
		boolean sorted;

		do {
			sorted = false;
			for (int i = 0; i < m.length - 1; i++) {
				if (m[i][0] >= m[i + 1][0]) {
					if (m[i][0] == m[i + 1][0] && m[i][1] < m[i + 1][1]) {
						continue;
					}
					
					int [] temp = m[i];
					m[i] = m[i + 1];
					m[i + 1] = temp;
					
					sorted = true;
				}
			}
		} while (sorted);
	}

}
