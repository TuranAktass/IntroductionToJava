import java.util.Scanner;

public class Exercise06_19 {

        public static boolean isValid(double side1, double side2, double side3) {
            return (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1);
        }

        public static double area(double side1, double side2, double side3) {
            double u = (side1 + side2 + side3) / 2;

            return Math.sqrt(u * (u - side1) * (u - side2) * (u - side3));
        }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side1 : ");
        double side1 = input.nextDouble();
        System.out.print("Enter side2 : ");
        double side2 = input.nextDouble();
        System.out.print("Enter side3 : ");
        double side3 = input.nextDouble();

        if (isValid(side1, side2, side3))
            System.out.println("Area : " + area(side1, side2, side3));
        else
            System.out.println("The input is invalid!");

        input.close();
    }
 
}
