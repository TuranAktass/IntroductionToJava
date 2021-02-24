import java.util.Scanner;

public class Exercise04_08 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an ASCII code :");
        int ascii = sc.nextInt();
        System.out.println("The character fot ASCII code " + ascii + " is " + (char) ascii);
        sc.close();

    }

}
