import java.util.Scanner;

public class Exercise04_17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year :");
        int year = sc.nextInt();
        System.out.print("Enter a month : ");
        String month = sc.next();
        sc.close();

        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul")
                || month.equals("Aug") || month.equals("Oct") || month.equals("Dec"))
            System.out.println(month + " " + year + " has 31 days.");

        else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov"))
            System.out.println(month + " " + year + " has 30 days.");
        else {
            if (leapYear == true)
                System.out.println(month + " " + year + " has 29 days.");
            else
                System.out.println(month + " " + year + " has 28 days.");
        }

    }

}
