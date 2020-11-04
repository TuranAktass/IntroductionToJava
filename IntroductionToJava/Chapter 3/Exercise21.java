import java.util.Scanner;

public class Exercise21 {
    public static void main(String args[]) {
       
        Scanner sc = new Scanner(System.in);
        int h, q, m, j, k;
        System.out.print("Enter year :");
        int year = sc.nextInt();
        System.out.print("\nEnter month :");
        m = sc.nextInt();

        if (m == 1) {
            m = 13;
            year -= 1;
        }

        else if (m == 2) {
            m = 14;
            year -= 1;
        }

        System.out.print("\nEnter the day of the month : ");
        q = sc.nextInt();

        j = year / 100;
        k = year % 100;

        h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + 5 * j) % 7;
        System.out.print("\nDay of the week is ");
        switch (h) {
            case 0:
                System.out.print("Saturday");
                break;
            case 1:
                System.out.print("Sunday");
                break;
            case 2:
                System.out.print("Monday");
                break;
            case 3:
                System.out.print("Tuesday");
                break;
            case 4:
                System.out.print("Wednesday");
                break;
            case 5:
                System.out.print("Thursday");
                break;
            case 6:
                System.out.print("Friday");
                break;
        }
        sc.close();

    }

}
