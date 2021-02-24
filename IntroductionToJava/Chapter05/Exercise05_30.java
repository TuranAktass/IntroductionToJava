import java.util.Scanner;

public class Exercise05_30 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount : ");
        double amount = input.nextDouble();
        System.out.print("Enter the annual interest rate : ");
        double interestRate = input.nextDouble();
        interestRate = interestRate / 100;
        System.out.print("Enter the number of the months : ");
        int month = input.nextInt();

        double savings = 0.0;
        for (int i = 1; i <= month; i++) {
            savings = (amount + savings) * (1 + interestRate / 12);
        }

        System.out.printf("Amount in the savings account : %.3f", savings);

        input.close();
    }

}
