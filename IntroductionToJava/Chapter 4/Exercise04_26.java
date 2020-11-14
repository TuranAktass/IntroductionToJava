import java.util.Scanner;
public class Exercise04_26 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an amount, for example 11.56 : ");
        String amount = sc.next();

        String numberOfOneDollars = amount.substring(0,amount.indexOf(','));
        int cents = Integer.parseInt(amount.substring(amount.indexOf(',') + 1));
        System.out.println(numberOfOneDollars + " " + cents);
        sc.close();
        int numberOfQuarters = cents/25;
        cents %= 25;

        int numberOfDimes = cents/10;
        cents%=10;

        int numberOfNickels = cents/5;
        cents %= 5;

        System.out.println("Your amount " + amount + "consist of ");
        System.out.println("\t" + numberOfOneDollars + " Dollars");
        System.out.println("\t" + numberOfQuarters+ " Quarters");
        System.out.println("\t" + numberOfDimes + " Dimes");
        System.out.println("\t" + numberOfNickels + " Nickels");
        System.out.println("\t" + cents + " Pennies");

    }
}
