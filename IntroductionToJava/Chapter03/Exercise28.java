import java.util.Scanner;

public class Exercise28 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r1's center x-,y- coordinates, width and height : ");
        double r1X = sc.nextDouble();
        double r1Y = sc.nextDouble();
        double r1W = sc.nextDouble();
        double r1H = sc.nextDouble();
        System.out.print("\nEnter r2's center x-,y- coordinates, width and height : ");
        double r2X = sc.nextDouble();
        double r2Y = sc.nextDouble();
        double r2W = sc.nextDouble();
        double r2H = sc.nextDouble();
        sc.close();

        
        double r1Top = r1Y + r1H/2;
        double r1Bottom = r1Y - r1H/2;
        double r1Right = r1X + r1W/2;
        double r1Left = r1X - r1W/2;

        double r2Top = r2Y + r2H/2;
        double r2Bottom = r2Y - r2H/2;
        double r2Right = r2X + r2W/2;
        double r2Left = r2X - r2W/2;
        
        if(r1Top >= r2Top && r1Bottom <= r2Bottom && r1Left <= r2Left && r1Right >= r2Right)
            System.out.println("r2 is inside r1");
        
        else if(r1Top < r2Bottom || r1Bottom > r2Top || r1Left > r2Right ||r1Right < r2Left)
            System.out.println("r2 does not overlap r1");

        else
            System.out.println("r2 overlaps r1");
            

    }
}