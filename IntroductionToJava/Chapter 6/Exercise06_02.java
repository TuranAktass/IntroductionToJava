import java.util.Scanner;

public class Exercise06_02 {

    public static int sumDigit(int n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();
        System.out.print("Sum of the digits : " + sumDigit(number));

        input.close();
    }
}
