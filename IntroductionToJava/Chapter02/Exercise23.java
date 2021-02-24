import java.util.Scanner;
public class Exercise23 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double distance,milesPerGallon,pricePerGallon;
        System.out.print("Enter the driving distance : ");
        distance = sc.nextDouble();
        System.out.print("\nEnter miles per gallon : ");
        milesPerGallon = sc.nextDouble();
        System.out.print("\nEnter price per gallon : ");
        pricePerGallon = sc.nextDouble();
        sc.close();
        
        double cost = distance / milesPerGallon * pricePerGallon;
        System.out.println("The cost of driving is : " + cost);



    }
    
}
