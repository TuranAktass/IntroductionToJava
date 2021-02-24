import java.util.Scanner;
public class Exercise4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double pound,kilograms;
        System.out.println("Enter a number in pounds : ");
        pound = sc.nextDouble();
        kilograms = pound * 0.454;
        System.out.println(pound + "pounds is" + kilograms + "kilograms");
        sc.close();
    }
}