import java.util.Scanner;
public class E09_11 {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a, b, c, d, e, f :");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		LinearEquation eq1 = new LinearEquation(a,b,c,d,e,f);
		
		if(!eq1.isSolvable()) {
			System.out.println("The equation has no solutions!");
		}
		else {
			System.out.println("x : " + eq1.getX() + "\ny : " + eq1.getY());
		}
		
		input.close();
	}

}
