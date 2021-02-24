import java.util.Scanner;

public class Exercise08_19 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		int[][] m = tempMatrix();
		displayMatrix(m);
		
		System.out.println(isConsecutiveFour(m));
		
		input.close();
	}

	public static boolean isConsecutiveFour(int[][] values) {
		boolean isConsecutive = false;
		
//		//isConsecutive row
//		for(int i = 0; i < values.length; i++) {
//			int counter = 1;
//			
//			for(int j = 0; j < values[0].length - 1; j++) {
//				if(values[i][j] == values[i][j + 1]) {
//					counter++;
//					
//					if(counter >= 4) {
//						return true;
//					}
//				}
//				else {
//					counter = 0;
//				}
//			}
//
//		}
//		
//		//isConsecutive column
//		for(int i = 0; i < values[0].length; i++) {
//			int counter = 1;
//			
//			for(int j = 0; j < values.length - 1; j++) {
//				if(values[j][i] == values[j + 1][i]) {
//					counter++;
//					
//					if(counter >= 4) {
//						return true;
//					}
//				}
//				
//				else {
//					counter = 0;
//				}
//			}
//		}
		
		for(int i = 0; i < values.length - 1; i++) {
			int counter = 1;
			for(int j = 0; j < values[0].length - 1; j++) {
				if(values[i][j] == values[i + 1][j + 1]) {
					counter++;
					
					if(counter >= 4) {
						return true;
					} 				else { counter = 0;}
				}

			}
		}


		
		return false;
	}

	public static int[][] getMatrix(Scanner input) {
		System.out.print("Enter the number of rows : ");
		int rows = input.nextInt();
		System.out.print("Enter the number of columns : ");
		int cols = input.nextInt();

		int[][] matrix = new int[rows][cols];

		for (int i = 0; i < matrix.length; i++) {
			System.out.println("Enter row " + i);
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextInt();
			}
		}

		return matrix;
	}

	public static void displayMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}

			System.out.println();
		}
	}
	
	public static int [][] tempMatrix(){
		int [][] m = {{1,0,2,3} , {0,1,2,3} , {1,0,1,2} , {1,4,2,1}};
		
		return m;
	}
}
