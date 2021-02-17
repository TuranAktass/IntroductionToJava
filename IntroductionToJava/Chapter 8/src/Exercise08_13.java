import java.util.Scanner;
public class Exercise08_13 {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of rows and columns of the array : ");
		int rows = input.nextInt();
		int cols = input.nextInt();
		
		System.out.println("Enter the array");
		double [][] array = new double [rows][cols];
		getArray(input , array);
		
		int [] location = locateLargest(array);
		System.out.println("The location of the largest element is at (" + location[0] + ", " + location[1] + ")");
	
		input.close();
	}
	
	public static int[] locateLargest(double [][] a) {
		double largest = a[0][0];
		int [] location = {0,0};
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				if(a[i][j] > largest) {
					largest = a[i][j];
					location[0] = i;
					location[1] = j;
				}
			}
		}
		
		return location;
	}
	
	public static void getArray(Scanner input, double [][]array){
		
		for(int i = 0; i <array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		
	}

}
