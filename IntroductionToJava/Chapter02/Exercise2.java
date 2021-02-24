import java.util.Scanner;
public class Exercise2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and length of a cylinder :");
        double radius = sc.nextDouble();
        double length = sc.nextDouble();
        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
        sc.close();       
    }
}