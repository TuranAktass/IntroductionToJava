public class Exercise06_01 {

    public static int getPentagonalNumber(int n) {
        return (n * (3 * n - 1) / 2);
    }

    public static void main(String args[]) {

        for (int i = 1; i <= 101; i++) {
            int pentagonal = getPentagonalNumber(i);
            System.out.print(pentagonal + " ");

            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}