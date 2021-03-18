import java.util.Scanner;
public class E10_15 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		double [][] points = new double[5][2];
		System.out.println("Enter five points : " );
		
		for(int i = 0; i < points.length; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}
	}
	
	public MyRectangle2D getRectangle(double [][] points) {
		
	}
}
