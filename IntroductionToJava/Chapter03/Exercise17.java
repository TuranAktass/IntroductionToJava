import java.util.Scanner;

public class Exercise17 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int computer = (int) (Math.random() * 3);
        System.out.print(" 0 for scissor \n 1 for rock \n 2 for paper ");
        int input = sc.nextInt();
        
        String comp = "comp";
        if (computer == 0)
            comp = "scissor";
        else if (computer == 1)
            comp = "rock";
        else if (computer == 2)
            comp = "paper";

        if (input == 0 && computer == 2 || input == 1 && computer == 0 || input == 2 && computer == 1)
            System.out.println("The computer is " + comp + ".\nCongratulations! You Win.");

        else if (input == computer)
            System.out.println("Draw!");

        else
            System.out.println("The computer is " + comp + ".\nYou Lose. Better Luck Next Time.");

        sc.close();

    }
}
