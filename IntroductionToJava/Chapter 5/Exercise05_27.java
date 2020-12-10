public class Exercise05_27 {

    public static void main(String args[]) {

        int year = 0;
        int count = 0;

        for (year = 101; year <= 2100; year++) {
            boolean isLeap = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

            if (isLeap == true) {
                System.out.print(year + " ");
                count++;

                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }

        System.out.printf("\nThere are %d leap years between 101-2100.", count);

    }

}
