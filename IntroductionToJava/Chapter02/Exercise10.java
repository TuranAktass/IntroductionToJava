import java.util.Scanner;
public class Exercise10 {
    public static void main(String args[]){
        double amount,initialTemp,finalTemp,energy;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms : ");
        amount = sc.nextDouble();
        System.out.print("\nEnter the initial temperature : ");
        initialTemp = sc.nextDouble();
        System.out.print("\nEnter the final temperature : ");
        finalTemp = sc.nextDouble();
        energy = amount * (finalTemp - initialTemp) * 4184;
        System.out.println("The energy needed is : " + energy);
        sc.close();



    }
    
}
