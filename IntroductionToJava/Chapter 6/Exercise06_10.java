public class Exercise06_10 {

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        int counter = 1;

        for (int number = 1; number < 10_000; number++) {

            if (isPrime(number) == true) {
                System.out.print(number + " ");
                counter++;

                if (counter % 10 == 0)
                    System.out.println();
            }
        }

    }
}
