import java.util.Scanner;

public class Exercise18 {

    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight of the package : ");
        double weight = sc.nextDouble();
        sc.close();

        if (weight > 50)
            System.out.println("The package cannot be shipped!");
        else {
            double cost = 0;
            if (weight > 0 && weight <= 1)
                cost = weight * 3.5;
            else if (weight <= 3)
                cost = weight * 5.5;
            else if (weight <= 10)
                cost = weight * 8.5;
            else if (weight <= 20)
                cost = weight * 10.5;


            System.out.println("Total cost is " + cost);
        }

    }
}