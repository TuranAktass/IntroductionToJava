import java.util.Scanner;
public class Exercise07 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an amount in integer : ");
        int amount = sc.nextInt();
        sc.close();

        int numberOfOneDollars = amount /100;
        amount = amount % 100;

        int numberOfQuarters = amount/25;
        amount = amount%25;

        int numberOfDimes = amount/10;
        amount = amount%10;

        int numberOfNickels = amount /5;
        amount = amount %5;

        int numberOfPennies = amount;
        System.out.println("Your amount " + amount + "consists of");
        System.out.println("		" + numberOfOneDollars + (numberOfOneDollars > 1 ? " dollars" : " dollar"));
		System.out.println("		" + numberOfQuarters + (numberOfQuarters > 1 ? " quarters " : " quarter"));
		System.out.println("		" + numberOfDimes + (numberOfDimes > 1 ? " dimes" : " dime"));
		System.out.println("		" + numberOfNickels + (numberOfNickels > 1 ? " nickels" : " nickel"));
		System.out.println("		" + numberOfPennies + (numberOfPennies > 1 ? " pennies" : " penny"));


    }
    
}
