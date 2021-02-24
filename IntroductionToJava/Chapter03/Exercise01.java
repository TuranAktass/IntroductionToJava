import java.util.Scanner;
public class Exercise01{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter a :");
        a = sc.nextDouble();
        System.out.print("\nEnter b :");
        b = sc.nextDouble();
        System.out.print("\nEnter c :");
        c = sc.nextDouble();
        double discriminant;
        discriminant = ((b*b) - (4*a*c));
        double root1,root2;
        root1 = (-b + Math.pow( Math.pow(b,2) - (4*a*c) ,0.5))/2*a;
        root2 = (-b - Math.pow( Math.pow(b,2) - (4*a*c) ,0.5))/2*a;
        if(discriminant<0){
            System.out.println("The equation has no real root!");
        }
        else if(discriminant==0){
            System.out.println("The equation has one root : "+root1);
            
        }
        else if(discriminant>0){
            System.out.println("The equation has two real roots :"+root1 +" and " +root2);
        }
        
        sc.close();
    }

}