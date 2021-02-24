import java.util.Scanner;

public class Exercise04_05 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of sides : ");
        int n = sc.nextInt();
        System.out.print("\nEnter the side : ");
        double side = sc.nextDouble();

        double area = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
        System.out.println("The area of polygon is " + area);
        sc.close();
    }
}
