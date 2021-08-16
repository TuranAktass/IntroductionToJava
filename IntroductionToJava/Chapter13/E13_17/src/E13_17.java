import java.util.Scanner;

public class E13_17 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first complex number: ");
		Complex c1 = new Complex(input.nextDouble(), input.nextDouble());
		
		System.out.println("Enter the second complex number: ");
		Complex c2 = new Complex(input.nextDouble(), input.nextDouble());
		
		System.out.println(c1.toString() + " + " + c2.toString() + " = " + c1.add(c2));
		System.out.println(c1.toString() + " - " +c2.toString() + " = " + c1.subtract(c2));
		System.out.println(c1.toString() + " * " + c2.toString() + " = " + c1.multiply(c2));
		System.out.println(c1.toString() + " / " + c2.toString() + " = " + c1.divide(c2));
	}
}
