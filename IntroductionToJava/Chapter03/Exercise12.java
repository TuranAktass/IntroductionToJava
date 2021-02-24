import java.util.Scanner;

public class Exercise12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit integer");
        int number = sc.nextInt();
        int numberClone = number;
        sc.close();

        int onesDigit = number % 10;
        number /= 100;

        if(number == onesDigit)
            System.out.println(numberClone + " is a palindrome.");
        else
            System.out.println(numberClone + " is not a palindrome.");
        
    }
}