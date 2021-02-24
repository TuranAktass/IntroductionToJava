public class Exercise06_14 {

    public static double estimatePi(int i) {
        double pi = 0.0;

        for (int j = 1; j <= i; j++) {
            pi += (Math.pow(-1 , j + 1) / (2 * j - 1));
        }

        pi *=4;
        return pi;
    }

    public static void main(String args[]) {

        System.out.println("i \t\t m(i)");
        System.out.println("_______________________");

        for (int i = 1; i < 1000; i += 100) {
            System.out.printf("%d \t\t %.4f\n", i, estimatePi(i));
        }
    }
}
