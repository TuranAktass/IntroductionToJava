import java.util.Scanner;
public class Exercise05_45 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 integers : ");

        double sum = 0;
        double sumOfSquares = 0.0;
        int n = 10;

        for(int i = 0; i < n; i++){
            double x = input.nextDouble();
            sum += x;
            sumOfSquares += x * x;
        }

        double mean = sum / n;
        System.out.println("Mean : " + mean);
        
        double deviation = Math.sqrt((sumOfSquares - Math.pow(sum , 2) / n) / (n - 1));
        System.out.println("Deviation : " + deviation);

        input.close();
    }
    
}
