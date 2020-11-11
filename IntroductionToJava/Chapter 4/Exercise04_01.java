import java.util.Scanner;

public class Exercise04_01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex : ");
        double r = sc.nextDouble();
        double side = 2 * r * (Math.sin(Math.PI / 5));
        double area = (5 * side * side) / (4 * Math.tan(Math.PI / 5));
        sc.close();
        System.out.printf("The area of the pentagon is %.2f", area);
    }
}