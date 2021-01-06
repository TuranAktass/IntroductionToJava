import java.util.*;
public class Exercise06_31 {

    public static boolean isValid(String cardNumber){

        return true;
    }

    
    public static int sumOfDoubleEvenPlace(String cardNumber){
        int sum = 0;
        int size = getSize(cardNumber);

        for(int i = 1; i < size; i+=2){
            int digit = Integer.parseInt(String.valueOf(cardNumber.charAt(i)));
            digit *= 2;
            sum += getDigit(digit);
        }

        return sum;
    }
    
    public static int getDigit(int number){
        if(number >= 10)
            return (number % 10) + (number / 10);
        else
            return number;
    }

    public static int sumOfOddPlace(String cardNumber){
        int sum = 0;
        int size = getSize(cardNumber);

        for(int i = 0; i < size; i+=2){
            sum += Integer.parseInt(String.valueOf(cardNumber.charAt(i)));
        }
        return sum;
    }

    public static boolean prefixMatched(String cardNumber , int d){
        return true;
    }

    public static int getSize(String cardNumber){
        return cardNumber.length();
    }

    public static long getPrefix(String cardNumber, int k){
        return 1;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a credit card number as a long integer : ");
        String cardNumber = input.next();

        System.out.println("sum of odd place : " + sumOfOddPlace(cardNumber));
        System.out.println("sum of even place : " + sumOfDoubleEvenPlace(cardNumber));

        input.close();
    }

}
