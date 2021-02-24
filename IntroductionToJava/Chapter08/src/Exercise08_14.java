import java.util.Scanner;
public class Exercise08_14 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the size for the matrix : ");
		int size = input.nextInt();

		int[][] matrix = squareMatrix(size);
		
		displayMatrix(matrix);
		checkRow(matrix);
		checkCol(matrix);
		checkDiagonals(matrix);
		
		input.close();
	}

	public static void displayMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}

			System.out.println();
		}
	}

	public static int[][] squareMatrix(int size) {
		int[][] m = new int[size][size];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j] = (int) (Math.random() * 2);
			}
		}

		return m;
	}

	public static void checkRow(int[][] m) {
		int rowSum;
		boolean allZerosRow = false;
		boolean allOnesRow = false;
		int zerosRowIndex = -1;
		int onesRowIndex = -1;

		for (int i = 0; i < m.length; i++) {
			rowSum = 0;

			for (int j = 0; j < m[0].length; j++) {
				rowSum += m[i][j];
			}

			if (rowSum == 0) {
				zerosRowIndex = i;
				allZerosRow = true;
			}

			else if (rowSum == m.length) {
				onesRowIndex = i;
				allOnesRow = true;
			}
		}

		if (!allZerosRow && !allOnesRow) {
			System.out.println("No same numbers on a row");
		}
		if (allZerosRow) {
			System.out.println("All 0s on row " + zerosRowIndex);
		}
		if (allOnesRow) {
			System.out.println("All 1s on row " + onesRowIndex);
		}
	}
	
	public static void checkCol(int [][] m) {
		int colSum;
		int zerosColIndex = -1;
		int onesColIndex = -1;
		boolean allOnesCol = false;
		boolean allZerosCol = false;
		
		for(int i = 0; i < m.length; i++) {
			colSum = 0;
			
			for(int j = 0; j < m[0].length; j++) {
				colSum += m[j][i];
			}
			
			if(colSum == 0) {
				allZerosCol = true;
				zerosColIndex = i;
			}
			
			if(colSum == m.length) {
				allOnesCol = true;
				onesColIndex = i;
			}
		}
		
		if (!allZerosCol && !allOnesCol) {
			System.out.println("No same numbers on a column");
		}
		if (allZerosCol) {
			System.out.println("All 0s on column " + zerosColIndex);
		}
		if (allOnesCol) {
			System.out.println("All 1s on column " + onesColIndex);
		}
		
	}
	
	public static void checkDiagonals(int [][] m){
		int sum = 0;
		boolean allZeros = false;
		boolean allOnes = false;
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				if(i == j) {
					sum += m[i][j];
				}
			}
			
		}
		
		if(sum == 0) {
			allZeros = true;
		}
		else if(sum == m.length) {
			allOnes = true;
		}
		
		if(allZeros) {
			System.out.println("All 0s on major diagonal");
		}
		else if(allOnes) {
			System.out.println("All 1s on major diagonal");
		}
		else {
			System.out.println("No same numbers on the major diagonal");
		}
		
		sum = 0;
		for(int i = 0; i < m.length; i++) {
			for(int j = m[0].length - 1; j > -1; j--) {
				
				if(i + j == m.length -1) {
					sum += m[i][j];
				}
			}
		}
		allZeros = false;
		allOnes = false;
		
		if(sum == 0) {
			allZeros = true;
		}
		else if(sum == m.length) {
			allOnes = true;
		}
		
		if(allZeros) {
			System.out.println("All 0s on sub-diagonal");
		}
		else if(allOnes) {
			System.out.println("All 1s on sub-diagonal");
		}
		else {
			System.out.println("No same numbers on the sub-diagonal");
		}
	}

}