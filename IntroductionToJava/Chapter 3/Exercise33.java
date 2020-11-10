import java.util.Scanner;
public class Exercise33 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1:");
        double p1W = sc.nextDouble();
        double p1P = sc.nextDouble();
        System.out.print("\n Enter weight and price for package 2:");
        double p2W = sc.nextDouble();
        double p2P = sc.nextDouble();
        sc.close();
    
        if(p2W/p2P == p1W/p1P)
            System.out.println("Two packages have the same price");
        else if(p2W/p2P > p1W/p1P)
            System.out.println("package 2 has a better price");
        else if(p2W/p2P < p1W/p1P)
            System.out.println("package 1 has a better price");

    }
    
}
