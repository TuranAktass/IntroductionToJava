import java.util.Scanner;

public class Exercise05_32 {
   
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int lotteryDigit1 = (int) (Math.random() * 10);
        int lotteryDigit2 = lotteryDigit1; 
        while (lotteryDigit1 == lotteryDigit2) {
            lotteryDigit2 = (int) (Math.random() * 10);
        }
        int lottery = lotteryDigit1 * 10 + lotteryDigit2;

        System.out.print("Enter your lottery pick (two digits) : ");
        int guess = input.nextInt();
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        if (lottery == guess)
            System.out.println("Exact match : You win $10,000");
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits : You win $3,000");
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit1 || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit : You win $1,000");
        else
            System.out.println("Sorry, no match");

        input.close();
    }

}
