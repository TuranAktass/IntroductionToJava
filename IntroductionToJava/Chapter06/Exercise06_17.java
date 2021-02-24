import java.util.Scanner;
public class Exercise06_17 {

    public static void printMatrix(int n) {

        for (int i = 1; i <= n * n; i++) {

            int x = (int) (Math.random() * 2);

            System.out.print(x + " ");

            if (i % n == 0)
                System.out.println();

        }

    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = input.nextInt();

        printMatrix(n);

        input.close();
    }

}
