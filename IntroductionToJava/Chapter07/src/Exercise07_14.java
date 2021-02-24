import java.util.Scanner;
public class Exercise07_14 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int [] numbers = new int[5];
		
		System.out.println("Enter five numbers : ");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		System.out.println("GCD : " + gcd(numbers));
		
		input.close();
	}
	
	public static int gcd(int [] array) {
		if(array.length < 2) {
			return -1;
		}
		
		int gcd = array[0];
		
		for(int i = 1; i < array.length; i++) {
			gcd = gcdTwo(gcd , array[i]);
		}
		
		return gcd;
	}
	
	public static int gcdTwo(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		
		return a;
	}
}
