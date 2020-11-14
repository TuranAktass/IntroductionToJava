import java.util.Scanner;

public class Exercise04_21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a SSN :");
        String input = sc.nextLine();

        if (input.charAt(3) == '-' && input.charAt(6) == '-' && input.length() == 11
                && Character.isDigit(input.charAt(0)) && Character.isDigit(input.charAt(1))
                && Character.isDigit(input.charAt(2)) && Character.isDigit(input.charAt(4))
                && Character.isDigit(input.charAt(5)) && Character.isDigit(input.charAt(7))
                && Character.isDigit(input.charAt(8)) && Character.isDigit(input.charAt(9))&&
                Character.isDigit(input.charAt(10)))
            System.out.println(input + " is a valid SSN");
        else
            System.out.println(input + " is an invalid SSN");
        sc.close();
    }

}
