import java.util.Scanner;

public class Exercise23 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates : ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double hDistance = Math.abs(x);
        double vDistance = Math.abs(y);
        sc.close();

        if(hDistance <= 10 / 2 && vDistance <= 5 / 2)
            System.out.println("The point (" + x +","+ y+") is in the rectangle");
        else   
            System.out.println("The point (" + x +","+ y+") is in not the rectangle");
            

        

    }

}
