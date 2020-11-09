import java.util.Scanner;
// https://umitsen.wordpress.com/2013/04/07/nokta-ucgenin-icinde-mi-degil-mi-test-etme/

public class Exercise27 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a point's x- and y- coordinates :");
        float pX = sc.nextFloat();
        float pY = sc.nextFloat();
        sc.close();
        /*
         * A (0,0) B (200,0) C(0,100) 
         * bx = Bx - Ax = 200-0 = 200 
         * by = By - Ay = 0 - 0 = 0 
         * cx = Cx - Ax = 0 - 0 = 0 
         * cy = Cy - Ay = 100 - 0 = 100 
         * x = Px - Ax = pX - 0 = pX 
         * y = pY - Ay = pY - o = pY 
         * d = bx * cy - cx*by
         */
        float d, wA, wB, wC;
        
        d = (200 * 100) - (0 * 0);
        wA = ((pX * (0 - 100) + pY * (0 - 200) + 200 * 100 - 0 * 0)) / d;
        wB = (pX * 100 - pY * 0) / d;
        wC = (pY * 200 - pX * 0) / d;
        if (wA > 0 && wA < 1 && wB > 0 && wB < 1 && wC > 0 && wC < 1) {
            System.out.println("The point is in the triangle");
        } else
            System.out.println("The point is not in the triangle");

    }

}
