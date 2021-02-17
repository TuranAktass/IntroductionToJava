public class Exercise08_10 {
	
	public static void main(String args[]) {
		int [][] matrix = new int [4][4];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int)(Math.random() * 2);
			}
		}
		
		displayMatrix(matrix);
		System.out.println("The largest row index : " + largestRow(matrix));
		System.out.println("The largest column index : " + largestCol(matrix));
	}
	
	public static void displayMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}

			System.out.println();
		}
	}
	
	public static int largestRow(int [][] m) {
		int [] rows = new int[m.length];
		
		for(int i = 0; i < m.length; i++) {
			int counter = 0;
			for(int j = 0; j < m[0].length; j++) {
				if(m[i][j] == 1)
					counter++;
				rows[i] = counter;
				
			}
		}
		int largestRowIndex = findMax(rows);
		
		return largestRowIndex;		
	}
	
	public static int largestCol(int [][] m) {
		int [] cols = new int[m.length];
		
		for(int i = 0; i < m.length; i++) {
			int counter = 0;
			for(int j = 0; j < m[0].length; j++) {
				if(m[j][i] == 1)
					counter++;
				
				cols[i] = counter;
			}
		}	
		int largestColIndex = findMax(cols);
		
		return largestColIndex;
	}
	
	public static int findMax(int [] ar) {
		int max = ar[0];
		int maxIndex = 0;
		
		for(int i = 0; i < ar.length; i++) {
			if(ar[i] > max) {
				maxIndex = i;
				max = ar[i];
			}
		}
		
		return maxIndex;
	}
}
