import java.util.Scanner;

public class Exercise07_12 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter ten numbers : ");
		
		double[] nums = new double[10];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = input.nextDouble();
		}
		
		double [] reversed = reverse(nums);
		
		for(int i = 0; i < reversed.length; i++) {
			System.out.print(reversed[i] + " ");
		}
		
		input.close();
	}
	
	public static double [] reverse(double [] array) {
		for(int i = 0, j = array.length - 1; i <= j; i++, j--) {
			double temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		
		return array;
	}
	
}
