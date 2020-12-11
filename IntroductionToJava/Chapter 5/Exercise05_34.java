import java.util.Scanner;

public class Exercise05_34 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int compScore = 0;
        int userScore = 0;
        int diff = 0;

        do {
            System.out.print(" 0 for scissor \n 1 for rock \n 2 for paper ");
            int input = sc.nextInt();

            int computer = (int) (Math.random() * 3);
            String comp = "comp";

            if (computer == 0)
                comp = "scissor";
            else if (computer == 1)
                comp = "rock";
            else if (computer == 2)
                comp = "paper";

            if (input == 0 && computer == 2 || input == 1 && computer == 0 || input == 2 && computer == 1) {
                System.out.println("The computer is " + comp + ".\nCongratulations! You Win.");
                userScore++;
            } else if (input == computer) {
                System.out.println("Draw!");
            } else {
                System.out.println("The computer is " + comp + ".\nYou Lose. Better Luck Next Time.");
                compScore++;
            }
            diff = Math.abs(compScore - userScore);
        } while (diff < 2);

        System.out.println("Users Score : " + userScore);
        System.out.println("Computers Score : " + compScore);

        sc.close();

    }

}
