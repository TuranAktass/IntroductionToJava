import java.util.Scanner;
public class Exercise3{
    public static void main(String args[]){
        double feet,meter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for feet : ");
        feet = sc.nextDouble();
        meter = feet * 0.305;
        System.out.println(feet + "feet is " + meter + "meters");
        sc.close();  
    }
}