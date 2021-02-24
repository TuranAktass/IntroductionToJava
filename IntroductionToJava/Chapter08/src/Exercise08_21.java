import java.util.Scanner;
public class Exercise08_21 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of cities : ");
		int numberOfCities = input.nextInt();
		
		double [][] coordinates = new double[numberOfCities][2]; //
		
		System.out.print("Enter the coordinates of the cities : ");
		for(int i = 0; i < numberOfCities; i++) {
			coordinates[i][0] = input.nextDouble();
			coordinates[i][1] = input.nextDouble();
		}
		
		double shortestDistance = distance(coordinates[0] , coordinates[1]);
		System.out.print(shortestDistance);
		
		for(int i = 0; i < coordinates.length; i++) {
			for(int j = 0; j < coordinates.length - 1; j++) {
				double currentDistance = distance(coordinates[i] , coordinates[j]);
				if(shortestDistance > currentDistance) {
					shortestDistance = currentDistance;
				}
			}
		}
		
	}
	
	public static double distance(double [] p1 , double [] p2) {
		double x1 = p1[0];
		double y1 = p1[1];
		
		double x2 = p2[0];
		double y2 = p2[1];
		
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
}
