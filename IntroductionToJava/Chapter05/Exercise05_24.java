public class Exercise05_24 {

    public static void main(String args[]) {

        double sum = 0.0;

        for (int i = 1; i <= 97; i += 2) {
            sum += (double) i / (double) (i + 2);
        }

        System.out.println("Sum : " + sum);

    }

}
