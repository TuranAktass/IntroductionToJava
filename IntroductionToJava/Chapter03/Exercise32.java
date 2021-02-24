import java.util.Scanner;

public class Exercise32 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1 and p2 : ");

        double p0x = sc.nextDouble();
        double p0y = sc.nextDouble();
        double p1x = sc.nextDouble();
        double p1y = sc.nextDouble();
        double p2x = sc.nextDouble();
        double p2y = sc.nextDouble();

        double var = ((p1x - p0x) * (p2y - p0y)) - ((p2x - p0x) * (p1y - p0y));
        sc.close();
        if (var > 0)
            System.out.println("(" + p2x + "," + p2y + ") is on the left side of the line from (" + p0x + "," + p0y
                    + ") to (" + p1x + "," + p1y + ")");
        else if(var == 0)
            System.out.println("(" + p2x + "," + p2y + ") is on the  line from (" + p0x + "," + p0y
        + ") to (" + p1x + "," + p1y + ")");
        else 
            System.out.println("(" + p2x + "," + p2y + ") is on the right side of the line from (" + p0x + "," + p0y
        + ") to (" + p1x + "," + p1y + ")");



    }
}
