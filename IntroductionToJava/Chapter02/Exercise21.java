import java.util.Scanner;
public class Exercise21{
    public static void main(String args[]){
        /*
            Write a program that reads in investment amount, annual interst rate,and number of years, and
        displays the future investment value using the following formula : 
            futureInvestmentValue = inverstmentAmount * (1+monthlyInterestRate)^numberOfYears*12
        For example if you enter amount 1000, annual rate is 3.25% and number of years 1, the future inverstment value is 1032.98
        
        */
        Scanner sc = new Scanner(System.in);
        double inAmount,inRate,years;
        double accValue;
        System.out.println("Enter investment amount : ");
        inAmount = sc.nextDouble();
        System.out.println("Enter annual interest rate in percentage : ");
        inRate = sc.nextDouble();
        System.out.println("Enter number of years : ");
        years = sc.nextDouble();
        accValue = inAmount * Math.pow((1 + inRate / 1200), 12 * years);
        System.out.println("Accumulated value is : " + accValue);
        sc.close();


    }
}