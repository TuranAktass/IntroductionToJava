import java.util.Scanner;

public class Exercise04_07 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the bounding circle :");
        double radius = sc.nextDouble();
        double part = Math.toRadians(360 / 5.0);
        double angle = part;

        double p1x = radius * Math.sin(angle);
        double p1y = radius * Math.cos(angle);
        angle += part;
        double p2x = radius * Math.sin(angle);
        double p2y = radius * Math.cos(angle);
        angle += part;
        double p3x = radius * Math.sin(angle);
        double p3y = radius * Math.cos(angle);
        angle += part;
        double p4x = radius * Math.sin(angle);
        double p4y = radius * Math.cos(angle);
        angle += part;        
        double p5x = radius * Math.sin(angle);
        double p5y = radius * Math.cos(angle);

        System.out.printf("The coordinates of five points on the pentagon are;");
        System.out.printf("\n (%.2f , %.2f)" , p1x,p1y);
        System.out.printf("\n (%.2f , %.2f)" , p2x,p2y);
        System.out.printf("\n (%.2f , %.2f)" , p3x,p3y);
        System.out.printf("\n (%.2f , %.2f)" , p4x,p4y);
        System.out.printf("\n (%.2f , %.2f)" , p5x,p5y);
        sc.close();
        
    
    }
}
