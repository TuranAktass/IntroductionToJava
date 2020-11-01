import java.util.Scanner;
public class Exercise9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a,v0,v1,t;
        System.out.print("Enter V0 : ");
        v0 = sc.nextDouble();
        System.out.print("\nEnter V1 : ");
        v1 = sc.nextDouble();
        System.out.print("\nEnter t : ");
        t = sc.nextDouble();
        a = (v1-v0)/t;
        sc.close();
        System.out.println("Acceleration : "+a);
    }
    
}
