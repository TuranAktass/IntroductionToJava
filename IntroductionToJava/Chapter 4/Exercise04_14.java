import java.util.Scanner;

public class Exercise04_14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter grade : ");
        char letterGrade = sc.nextLine().charAt(0);

        if (letterGrade == 'A' || letterGrade == 'B' || letterGrade == 'C' || letterGrade == 'D'
                || letterGrade == 'F') {

            System.out.print("\nThe numeric value for grade " + letterGrade + " is");
            
            switch (letterGrade) {
                case 'A':
                    System.out.print(" 4");
                    break;
                case 'B':
                    System.out.print(" 3");
                    break;
                case 'C':
                    System.out.print(" 2");
                    break;
                case 'D':
                    System.out.print(" 1");
                    break;
                case 'F':
                    System.out.print(" 0");
                    break;

            }
        } else
            System.out.println(letterGrade + " is an invalid grade!");

        sc.close();
    }
}
