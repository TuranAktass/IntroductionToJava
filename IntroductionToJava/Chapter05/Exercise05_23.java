public class Exercise05_23 {

    public static void main(String args[]) {

        int n = 50000;

        double sumLeft_Right = 0.0;
        double sumRight_Left = 0.0;

        for (int i = 1; i <= n; i++) {
            sumLeft_Right += 1.0 / i;
        }
        System.out.print("Left to right : " + sumLeft_Right);

        for (int i = n; i > 0; i--) {
            sumRight_Left += 1.0 / i;
        }
        System.out.print("\nRight to left : " + sumRight_Left);

    }

}