public class Exercise08_22 {

	public static void main(String args[]) {
		int [][] matrix = newMatrix(6);
		
		displayMatrix(matrix);
		checkRow(matrix);
		checkColumn(matrix);
	}
	
	public static int [][] newMatrix(int size){
		int [][] matrix = new int[size][size];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int)(Math.random() * 2);
			}
		}
		
		return matrix;
	}
	
	public static void displayMatrix(int [][] m) {
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void checkRow(int [][] m) {
		for(int i = 0; i < m.length; i++) {
			int counter = 0;
			
			for(int j = 0; j < m[0].length; j++) {
				if(m[i][j] == 1) {
					counter++;					
				}
			}
			
			if(counter % 2 == 0) {
				System.out.println("Row " + i + " have even number of 1s");
			}
		}
	}
	
	public static void checkColumn(int [][] m) {
		for(int i = 0; i < m[0].length; i++) {
			int counter = 0;
			for(int j = 0; j < m.length; j++) {
				if(m[j][i] == 1) {
					counter++;
				}
			}
			if(counter % 2 == 0) {
				System.out.println("Column " + i + " have even number of 0s");
			}
		}
	}
}
