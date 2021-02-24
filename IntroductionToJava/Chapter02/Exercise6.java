import java.util.Scanner;

public class Exercise6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number,sumOfDigits = 0;
        System.out.print("Enter a number between 0 and 1000 : ");
        number = sc.nextInt();
        sumOfDigits += number%10;
        number /=10;
        sumOfDigits+=number % 10;
        number/=10;
        sumOfDigits+=number%10; 
        System.out.println("Sum of the digits is " + sumOfDigits);
        sc.close(); 

    }
}
