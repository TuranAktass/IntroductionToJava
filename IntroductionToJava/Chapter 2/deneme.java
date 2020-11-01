import java.util.Scanner;
public class deneme{
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three points for a triangle: ");
		double x1, y1, x2, y2, x3, y3;
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		
		double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);
		double side3 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		double side = (side1 + side2 + side3) / 2;
		double area = Math.pow(side * (side - side1) * (side - side2) * (side - side3) , 0.5);
		
		System.out.println("The area of the triangle is " + (float)area);
		
		input.close();
	}

}