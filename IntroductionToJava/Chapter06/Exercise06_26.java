public class Exercise06_26 {

    public static boolean isPalindrome(int n) {
        StringBuilder s = new StringBuilder(n + "");
        s = s.reverse();

        if (n == Integer.parseInt(s.toString()))
            return true;
        else
            return false;

    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        int counter = 0;

        for (int i = 2; counter < 100; i++) {

            if (isPrime(i) && isPalindrome(i)) {
                System.out.print(i + " ");
                counter++;

                if (counter % 10 == 0)
                    System.out.println();
            }

        }
    }
}
