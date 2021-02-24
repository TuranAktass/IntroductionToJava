import java.util.Scanner;

public class Exercise04_02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude nad longitude) in degrees");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("\nEnter point 2 (latitude and longitude) in degrees");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        sc.close();
        double radius = 6371.01;
        double sinx1 = Math.sin((Math.toRadians(x1)));
        double sinx2 = Math.sin((Math.toRadians(x2)));
        double cosx1 = Math.cos((Math.toRadians(x1)));
        double cosx2 = Math.cos((Math.toRadians(x2)));
        double cosy1_y2 = Math.cos(Math.toRadians(y1) - Math.toRadians(y2));
        double distance = radius * (Math.acos(sinx1 * sinx2 + cosx1 * cosx2 * cosy1_y2));
        System.out.println("The distance between the two points is " + distance + "km");
    }

}
