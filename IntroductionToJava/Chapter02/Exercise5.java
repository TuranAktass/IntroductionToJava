import java.util.Scanner;
public class Exercise5{
    public static void main(String args[]){
        double subtotal,gratuityRate,total,gratuity;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the subtotal :");
    subtotal = sc.nextDouble();
    System.out.println("Enter a gratuity rate : ");
    gratuityRate = sc.nextDouble();
    gratuityRate = gratuityRate/100;
    gratuity = (subtotal*gratuityRate);
    total = subtotal + gratuity;
    System.out.println("The gratuity is : " + gratuity + "and total is " + total);
    sc.close();
    
    }
}