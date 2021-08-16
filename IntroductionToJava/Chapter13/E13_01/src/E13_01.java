import java.util.Scanner;

public class E13_01 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three sides of a triangle");
		
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		
		System.out.print("Enter a color" );
		String color = input.next();
		
		System.out.print("Enter a filled value (T/F): ");
		String fillString = input.next();
		boolean filled = false;
		
		switch(fillString.toLowerCase().charAt(0)) {
			case 't':
				filled = true;
				break;
		
			case 'f':
				filled = false;
				break;
				
			default: 
				System.out.println("Invalid input!");
				System.exit(1);
		}
		
		input.close();
		
		Triangle triangle = new Triangle(s1,s2,s3);
		triangle.setColor(color);
		triangle.setFilled(filled);
		
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("color: " + triangle.getColor());
		System.out.println("filled: " + triangle.isFilled());
	}
}
