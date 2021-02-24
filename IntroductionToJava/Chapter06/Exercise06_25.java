public class Exercise06_25 {

    public static String convertMillis(long millis) {

        int hours = (int) millis / 3_600_000;
        millis %= 3_600_000;
        int minutes = (int) millis / 60_000;
        millis %= 60_000;
        int seconds = (int) millis / 1_000;
        
        return hours + ":" + minutes + ":" + seconds;

    }

    public static void main(String args[]) {

        System.out.println(convertMillis(5500));
        System.out.println(convertMillis(100_000));
        System.out.println(convertMillis(555550000));

    }
}
