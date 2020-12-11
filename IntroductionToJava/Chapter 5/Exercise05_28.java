import java.util.Scanner;

public class Exercise05_28 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year : ");
        int year = input.nextInt();
        System.out.print("Enter the first day (1 for monday, 2 for tuesday etc.): ");
        int firstDay = input.nextInt();

        boolean isLeap = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);

        String day = "  ";
        String month = "    ";
        int totalDay = 0;

        switch (firstDay) {
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
        }

        System.out.println("January 1 : " + year + " is " + day + "\n");

        for (int i = 2; i <= 12; i++) {
            switch (i) {
                case 3:
                    month = "March";
                    totalDay += isLeap ? 29 : 28;
                    ;
                    break;
                case 5:
                    month = "May";
                    totalDay += 30;
                    break;
                case 7:
                    month = "July";
                    totalDay += 31;
                    break;
                case 8:
                    month = "August";
                    totalDay += 30;
                case 10:
                    month = "October";
                    totalDay += 30;
                    break;
                case 12:
                    month = "December";
                    totalDay += 30;
                    break;
                case 2:
                    month = "February";
                    totalDay += 31;
                    break;
                case 4:
                    month = "April";
                    totalDay += 31;
                    break;
                case 6:
                    month = "June";
                    totalDay += 31;
                    break;
                case 9:
                    month = "September";
                    totalDay += 31;
                    break;
                case 11:
                    month = "November";
                    totalDay += 31;
                    break;
            }

            int lastDay = totalDay % 7;

            switch (lastDay) {
                case 0:
                    day = "Sunday";
                    break;
                case 1:
                    day = "Monday";
                    break;
                case 2:
                    day = "Tuesday";
                    break;
                case 3:
                    day = "Wednesday";
                    break;

                case 4:
                    day = "Thursday";
                    break;
                case 5:
                    day = "Friday";
                    break;
                case 6:
                    day = "Saturday";
                    break;

            }

            System.out.println(month + " 1 :  " + year + " is " + day);

        }

        input.close();

    }
}
