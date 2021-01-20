import java.util.Scanner;

public class Exercise07_10 {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		double [] doubles = new double[10];
		
		System.out.println("Enter ten double values : ");
		
		for(int i = 0; i < doubles.length; i++) {
			doubles[i] = input.nextDouble();
		}
		
		System.out.println("Index of Smallest Element : " + indexOfSmallestElement(doubles));
		
		input.close();
	}
	
	public static int indexOfSmallestElement(double [] array) {
		int index = 0;
		
		double min = minValue(array);
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == min) {
				index = i;
			}
		}
		
		return index;
	}
	
	public static double minValue(double[] array) {
		double min = array[0];

		for (int i = 0; i < array.length; i++) {

			if (array[i] < min) {
				min = array[i];
			}
		}

		return min;
	}
}
