public class Exercise06_16 {

    public static int numberOfDaysInAYear(int year) {
        boolean isLeap = false;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            isLeap = true;
        }

        if (isLeap == true)
            return 366;
        else
            return 365;
    }

    public static void main(String args[]) {

        for (int i = 2000; i <= 2020; i++) {
            System.out.printf("%d has %d days.\n", i, numberOfDaysInAYear(i));
        }

    }
}
