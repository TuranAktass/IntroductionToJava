import java.util.Scanner;
public class Exercise05_37 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number : ");
        int decimal = input.nextInt();

        int binary = 0, power = 0;
        
        while(decimal > 0){
            int remainder = decimal % 2;
            decimal /= 2;
            binary += remainder * Math.pow(10 , power++);
        }

        System.out.println(" (Decimal) = " + binary + " (Binary) ");

        input.close();
    }
    
}
