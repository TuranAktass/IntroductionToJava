public class Exercise06_13 {

    public static double sumSeries(int i) {
        double sum = 0.0;

        for (int j = 1; j <= i; j++) {
            sum += ((double)j / (double)(j + 1));
        }

        return sum;
    }

    public static void main(String args[]) {

        System.out.println("i \t\t m(i)");
        System.out.println("_______________________");
        for (int i = 1; i <= 20; i++) {
            double sum = sumSeries(i);
            System.out.printf("%d \t\t %.4f\n", i, sum);
        }
    }
}
