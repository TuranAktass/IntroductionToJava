public class Exercise05_25 {

    public static void main(String args[]) {

        for (int n = 10_000; n <= 100_000; n += 10_000) {
            double PI = 0.0;
            double divisor = 1;

            for (int i = 1; i <= n; i++) {
                PI += Math.pow(-1, i + 1) / divisor;
                divisor += 2;
            }
            
            PI *= 4;
            System.out.println("PI value for n = " + n + "   " + PI);
        }

    }

}
