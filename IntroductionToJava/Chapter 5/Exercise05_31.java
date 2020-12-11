import java.util.Scanner;
public class Exercise05_31 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the initial deposit amount : ");
        double depositAmount = input.nextDouble();
        System.out.print("Enter annual percentage yield : ");
        double yield = input.nextDouble();
        System.out.print("Enter the maturity period (number of months): ");
        int maturity = input.nextInt();

        double total = depositAmount; 
        System.out.print("Month     CD Value");
        for(int i = 1; i <= maturity; i++){
            total += total * yield / 1200;
            System.out.printf("\n%d       %.2f", i,total);
        }

        input.close();
    }
    
}
