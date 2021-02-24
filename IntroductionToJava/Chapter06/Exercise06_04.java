import java.util.Scanner;

public class Exercise06_04 {

    public static void reverse(int number) {
        String reverseNumber = "";
        int numberCopy = number;

        while (number != 0) {
            reverseNumber += number % 10;
            number /= 10;
        }

        System.out.println(numberCopy + "--->" + reverseNumber);
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = input.nextInt();

        reverse(number);
        input.close();
    }

}
