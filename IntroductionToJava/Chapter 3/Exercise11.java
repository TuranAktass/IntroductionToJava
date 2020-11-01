import java.util.Scanner;

public class Exercise11 {
    public static void main(String args[]) {
        /*
         * Write a program that prompts the user to enter the month and year and
         * displays the number of days in the month. For example, if the user entered
         * month 2 and year 2012, the program should display that February 2012 had 29
         * days. If the user entered month 3 and year 2015, the program should display
         * that March 2015 had 31 days
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month and year : ");
        int month = sc.nextInt();
        int year = sc.nextInt();
        int leapYear = 0;
        if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0) {
            leapYear = 1;
        }
        // System.out.println(leapYear);
        sc.close();
        switch (month) {
            case 1:
                System.out.println("January /" + year + "--> 31 days");
                break;
            case 2:
                if (leapYear == 1) {
                    System.out.println("February /" + year + "--> 29 days");
                } else {
                    System.out.println("February /" + year + "--> 28 days");
                }
                break;
            case 3:
                System.out.println("March /" + year + "--> 31 days");
                break;
            case 4:
                System.out.println("April /" + year + "--> 30 days");
                break;
            case 5:
                System.out.println("May /" + year + "--> 31 days");
                break;
            case 6:
                System.out.println("June /" + year + "--> 30 days");
                break;
            case 7:
                System.out.println("July /" + year + "--> 31 days");
                break;
            case 8:
                System.out.println("August /" + year + "--> 31 days");
                break;
            case 9:
                System.out.println("September /" + year + "--> 30 days");
                break;
            case 10:
                System.out.println("October /" + year + "--> 31 days");
                break;
            case 11:
                System.out.println("November /" + year + "--> 30 days");
                break;
            case 12:
                System.out.println("December /" + year + "--> 31 days");
                break;

        }

    }

}
