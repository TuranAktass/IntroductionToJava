import java.util.Scanner;

public class E13_20 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a, b, c");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		displayRoots(a,b,c);
	}
	
	private static void displayRoots(double a, double b, double c) {
		double disc = discriminant(a,b,c);
		double r1 = 0.0;
		double r2 = 0.0;
		
		StringBuilder result = new StringBuilder("The equation has ");
		
		if(disc > 0) {
			r1 = calculateRoot(a,b,disc,true);
			r2 = calculateRoot(a,b,disc,false);
			
			result.append("two roots: " + r1 + ", " + r2);
		} else if(disc < 0) {
			double realPart = b / 2;
			double imaginaryPart = Math.sqrt(Math.abs(disc)) / 2;
			
			Complex complexR1 = new Complex(-realPart, imaginaryPart);
			Complex complexR2 = new Complex(-realPart, -imaginaryPart);
			
			result.append("two roots: " + complexR1 + ", " + complexR2);
			
		} else {
			r1 = calculateRoot(a,b,disc,true);
			result.append("one root: " + r1);
		}
		
		System.out.println(result);
	}
	
	private static double calculateRoot(double a, double b, double disc, boolean isR1) {
		double root;
		
		if(isR1) {
			root = (-b + Math.sqrt(disc)) / (2 * a);
		} else {
			root = (-b - Math.sqrt(disc)) / (2 * a);
		}
		
		return root;
	}
	
	private static double discriminant(double a, double b, double c) {
		return (b * b) - (4 * a * c);
	}
}