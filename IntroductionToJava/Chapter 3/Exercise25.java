import java.util.Scanner;

public class Exercise25 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double x1, x2, x3, x4, y1, y2, y3, y4;
        System.out.println("Enter x1, x2, x3, x4, y1, y2, y3, y4");
        x1 = sc.nextDouble();
        x2 = sc.nextDouble();
        x3 = sc.nextDouble();
        x4 = sc.nextDouble();
        y1 = sc.nextDouble();
        y2 = sc.nextDouble();
        y3 = sc.nextDouble();
        y4 = sc.nextDouble();

        double a = 
        double b = 
        double c = 
        double d = 
        double e = 
        double f = 
        sc.close();

        if((a*d)-(b*c) == 0){
            System.out.println("The equation has no solution!");    
        }
        else {
        x = ((e*d) - (b*f))/((a*d) - (b*c));
        y = ((a*f) - (e*c))/((a*d) - (b*c));
        System.out.println("x is " + x +" and y is " + y);


    }

}
