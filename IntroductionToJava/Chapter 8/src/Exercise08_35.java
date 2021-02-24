import java.util.Scanner;
public class Exercise08_35 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of rows in the matrix : ");
		int numberOfRows = input.nextInt();
		
		System.out.println("Enter the matrix row by row");
		int [][] m = getMatrix(input , numberOfRows);
		
	}
	
	public static int [][] getMatrix(Scanner input ,int size) {
		int [][] matrix = new int[size][size];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0 ; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		
		return matrix;
	}
	
	public static int [] findLargestBlock(int [][] m) {
		
	}
}
