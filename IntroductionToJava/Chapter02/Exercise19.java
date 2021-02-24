import java.util.Scanner;
public class Exercise19{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double x1,x2,x3,y1,y2,y3;
        double area;
        System.out.println("Enter three points for a triangle");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        x3 = sc.nextDouble();
        y3 = sc.nextDouble();
        sc.close();

        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);
        double side3 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double s = (side1+side2+side3)/2;
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("THe area of the triangle is " + area);

    }
}