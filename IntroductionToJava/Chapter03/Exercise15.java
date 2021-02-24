import java.util.Scanner;

public class Exercise15 {
    /*
     * (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a
     * threedigit number. The program prompts the user to enter a three-digit number
     * and determines whether the user wins according to the following rules:
     * 
     * 1. If the user input matches the lottery number in the exact order, the award
     * is $10,000. 2. If all digits in the user input match all digits in the
     * lottery number, the award is $3,000. 3. If one digit in the user input
     * matches a digit in the lottery number, the award is $1,000.
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int lottery = (int) (Math.random() * 1000);
        System.out.println(lottery);
        int lDigitOnes, lDigitTens, lDigitHundreds;

        lDigitOnes = lottery % 10;
        lottery /= 10;
        lDigitTens = lottery % 10;
        lottery /= 10;
        lDigitHundreds = lottery % 10;

        System.out.print("Enter your guess : ");
        int guess = sc.nextInt();
        sc.close();

        int gDigitOnes, gDigitTens, gDigitHundreds;

        gDigitOnes = guess % 10;
        guess /= 10;
        gDigitTens = guess % 10;
        guess /= 10;
        gDigitHundreds = guess % 10;

        // System.out.println(gDigitOnes + " " + gDigitTens +" " + gDigitHundreds);
        // System.out.println(lDigitOnes + " " + lDigitTens + " " + lDigitHundreds);

        //1. If the user input matches the lottery number in the exact order, the award is $10,000.
        if (lDigitOnes == gDigitOnes && lDigitTens == gDigitTens && lDigitHundreds == gDigitHundreds)
            System.out.println("Congratulations! You win $10,000");

        //2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
        else if ((gDigitOnes == lDigitOnes && gDigitTens == lDigitTens && gDigitHundreds == lDigitHundreds)
                || (gDigitOnes == lDigitOnes && gDigitHundreds == lDigitTens && gDigitTens == lDigitHundreds)
                || (gDigitTens == lDigitOnes && gDigitOnes == lDigitTens && gDigitHundreds == lDigitHundreds)
                || (gDigitTens == lDigitOnes && gDigitHundreds == lDigitTens && gDigitOnes == lDigitHundreds)
                || (gDigitHundreds == lDigitOnes && gDigitTens == lDigitTens && gDigitOnes == lDigitHundreds)
                || (gDigitHundreds == lDigitOnes && gDigitOnes == lDigitTens && gDigitTens == lDigitHundreds))
            System.out.println("Congratulations! You Win $3,000");

        //3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
        else if (gDigitOnes == lDigitOnes || gDigitOnes == lDigitTens || gDigitOnes == lDigitHundreds
                || gDigitTens == lDigitOnes || gDigitTens == lDigitTens || gDigitTens == lDigitHundreds
                || gDigitHundreds == lDigitOnes || gDigitHundreds == lDigitTens || gDigitHundreds == lDigitHundreds)
            System.out.println("Congratulations! You Win $1,000");
        //
        else
            System.out.println("Better Luck Next Time!");

    }
}
