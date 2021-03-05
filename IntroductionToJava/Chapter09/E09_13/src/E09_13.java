import java.util.Scanner;
public class E09_13 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		double[][] array = getArray(input);
		Location largest = locateLargest(array);

		System.out.println("The location of the largest number is : " + largest.maxValue + 
				" at (" + largest.row + ","	+ largest.column + ")");
	}

	public static double[][] getArray(Scanner input) {
		System.out.println("Enter the number of rows and columns in array : ");
		int row = input.nextInt();
		int column = input.nextInt();
		
		System.out.println("Enter the array");
		double[][] arr = new double[row][column];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = input.nextDouble();
			}
		}

		return arr;
	}

	public static Location locateLargest(double[][] a) {
		Location l = new Location();
		l.column = 0;
		l.row = 0;
		l.maxValue = a[0][0];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] > l.maxValue) {
					l.row = i;
					l.column = j;
					l.maxValue = a[i][j];
				}
			}
		}

		return l;
	}
}
