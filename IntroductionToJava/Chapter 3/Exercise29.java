import java.util.Scanner;

public class Exercise29 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter circle1's center x-,y- coordinates, and radius");
        double c1X = sc.nextDouble();
        double c1Y = sc.nextDouble();
        double c1R = sc.nextDouble();
        System.out.print("\nEnter circle2's center x-,y- coordinates, and radius");
        double c2X = sc.nextDouble();
        double c2Y = sc.nextDouble();
        double c2R = sc.nextDouble();
        sc.close();

        double distance = 
        Math.pow((Math.pow(c2X - c1X , 2) + Math.pow(c2Y - c1Y,2)),0.5);
        double r = Math.abs(c1R - c2R);
        if(distance <= r)
            System.out.println("circle2 is inside circle1");
        else if(distance <= c1R + c2R)
            System.out.println("circle2 overlaps circle1");
        else 
            System.out.println("circle2 does not overlap circle1");
        

    }
    
}
