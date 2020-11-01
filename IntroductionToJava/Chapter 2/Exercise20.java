import java.util.Scanner;
public class Exercise20{
    public static void main(String args[]){
        /*
        IF you know the balance and the annual percentage interest rate, you can compute the interest
        on the next monthly payment using the following formula 
        interest = balance * (annualInterestRate/1200)
        Write a program that reads the balance and the annual percentage interest rate and displays the
        interest for the next month. Sample RUN : 1000 3.5 -> 2.91667
        */ 
        double balance,interestRate;
        double interest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance : ");
        balance = sc.nextDouble();
        System.out.println("Enter interest rate :");
        interestRate = sc.nextDouble();
        sc.close();
        interest = balance *(interestRate/1200);
        System.out.println("The interest is : " + interest);



    }
}