import java.util.Scanner;

public class Exercise25 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float x1, x2, x3, x4, y1, y2, y3, y4;
        System.out.println("Enter x1, x2, x3, x4, y1, y2, y3, y4");
        x1 = sc.nextFloat();
        y1 = sc.nextFloat();
        x2 = sc.nextFloat();
        y2 = sc.nextFloat();
        x3 = sc.nextFloat();
        y3 = sc.nextFloat();
        x4 = sc.nextFloat();
        y4 = sc.nextFloat();

        float a = y1 - y2;
        float b = -1 * (x1 - x2);
        float c = y3 - y4;
        float d = -1 * (x3 - x4);
        float e = (a * x1) - (x1 - x2) * y1;
        float f = (c * x3) - (x3 - x4) * y3;
        float disc = a * d - b * c;
        sc.close();

        if (disc == 0)
            System.out.println("The two lines are parallel");
        else {
            float x = ((e * d) - (b * f)) / disc;
            float y = ((a * f) - (e * c)) / disc;
            System.out.println("The intersection point is at  (" + x + "," + y + ")");   
        }

    }
}
