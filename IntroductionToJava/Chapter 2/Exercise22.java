import java.util.Scanner;
public class Exercise22{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an amount in double :");
        int amount = sc.nextInt();
        int remainingAmount = amount;
        sc.close();
        //dollars
        int numberOfOneDOllars = remainingAmount /100;
        remainingAmount = remainingAmount%100;
        //quarters
        int numberOFQuarters = remainingAmount/25;
        remainingAmount = remainingAmount%25;
        //dimes
        int numberOfDimes = remainingAmount/10;
        remainingAmount = remainingAmount%10;
        //nickels
        int numberOfNickels = remainingAmount/5;
        remainingAmount = remainingAmount%5;
        //pennies
        int numberOfPennies = remainingAmount;

        System.out.println("Your amount : " + amount + "consist of");
        System.out.println("    " + numberOfOneDOllars + " dollars");
        System.out.println("    " + numberOFQuarters + " quarters");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");
        


    }
}