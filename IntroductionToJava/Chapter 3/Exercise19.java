import java.util.Scanner;

public class Exercise19 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean isValid = false;

        System.out.print("Enter the edges for a triangle : ");
        double edge1 = sc.nextDouble();
        double edge2 = sc.nextDouble();
        double edge3 = sc.nextDouble();
        double perimeter = edge1 + edge2 + edge3;
        sc.close();

        if ((edge1 + edge2) > edge3 && (edge2 + edge3) > edge1 && (edge1 + edge3) > edge2)
            isValid = true;
        if (isValid == true)
            System.out.println("Perimeter : " + perimeter);
        else
            System.out.println("The input is invalid!");
    }

}
