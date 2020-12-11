public class Exercise05_33 {

    public static void main(String args[]) {

        for (int i = 1; i < 10_000; i++) {
            int sum = 0;

            for (int n = 1; n < i; n++) {
                if (i % n == 0)
                    sum += n;
            }

            if (sum == i) {
                System.out.print(i + "  ");
            }
        }
    
    }

}