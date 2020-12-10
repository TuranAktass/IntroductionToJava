import java.util.Scanner;

public class Exercise05_01 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int number;
        int positive = 0, negative = 0, total = 0, count = 0;
        double average;

        System.out.println("Enter an integer, the input ends if it is 0 :");
        number = input.nextInt();

        while (number != 0) {
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                count--;
            }
            count++;
            total += number;
            number = input.nextInt();
        }
        average = (double) (total) / (double) (count);

        System.out.println("The number of positives is : " + positive);
        System.out.println("The number of negatives is : " + negative);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);

        input.close();
    }
}