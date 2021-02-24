import java.util.Scanner;
public class Exercise07_08 {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		double [] doubles = new double[10];
		
		System.out.println("Enter ten double values : ");
		
		for(int i = 0; i < doubles.length; i++) {
			doubles[i] = input.nextDouble();
		}
		
		System.out.println("Average : " + average(doubles));
		
		input.close();
	}
	
	public static int average(int [] array) {
		int average = 0;
		
		for(int i = 0; i < array.length; i++) {
			average += array[i];
		}
		
		average /= array.length;
		
		return average;
	}
	
	public static double average(double [] array) {
		double average = 0.0;
		
		for(int i = 0; i < array.length; i++) {
			average += array[i];
		}
		
		average /= array.length;
		
		return average;
	}
}
