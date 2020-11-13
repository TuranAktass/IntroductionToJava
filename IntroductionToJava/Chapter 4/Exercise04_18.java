import java.util.Scanner;

public class Exercise04_18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two characters : ");
        String input = sc.nextLine();
        char major = input.charAt(0);
        int year = (int) (input.charAt(1));
        if (year < 1 ||year > 4 || major != 'M' || major != 'C' || major != 'I')
            System.out.println("Invalid Input!");
        else {
            switch (major) {
                case 'M':
                    System.out.print("\nMathematichs");
                    break;
                case 'C':
                    System.out.print("\nComputer Science");
                    break;
                case 'I':
                    System.out.print("\nInformation Technology");
                    break;
            }
            switch (year) {
                case '1':
                    System.out.print(" Freshman");
                    break;
                case '2':
                    System.out.print(" Sophomore");
                    break;
                case '3':
                    System.out.print(" Junior");
                    break;
                case '4':
                    System.out.print(" Senior");
                    break;
            }
        }

        sc.close();
    }
}