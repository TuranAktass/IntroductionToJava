public class Exercise05_26 {

    public static void main(String args[]) {

        for (int i = 10_000; i <= 100_000; i += 10_000) {
            double E = 1.0;
            double item = 1.0;

            for (int n = 2; n <= i; n++) {
                E += item;
                item /= n;
            }

            System.out.printf("For i = %d , E is : %f", i, E);
            System.out.println();
        }

    }

}
