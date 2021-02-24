import java.util.Scanner;
public class Exercise06_22 {

    public static double sqrt(long n) {

        double lastGuess = 1.0;
        double nextGuess;

        while (true) {
            nextGuess = (lastGuess + n / lastGuess) / 2;

            if (Math.abs(nextGuess - lastGuess) < 0.0001)
                return nextGuess;  
            else
                lastGuess = nextGuess;    
        }

    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        long n = input.nextLong();

        System.out.printf("sqrt(%d) = %.4f" , n , sqrt(n));

        input.close();
    }
}
