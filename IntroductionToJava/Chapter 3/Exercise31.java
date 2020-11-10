import java.util.Scanner;
public class Exercise31 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB");
        double exRate = sc.nextDouble();
        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa");
        int x = sc.nextInt();
        switch(x){
            case 0 :
                System.out.println("Enter the dollar amount :");
                double  dollars = sc.nextDouble();
                System.out.println("$"+dollars + " is " + exRate*dollars + "yuan");
                break;
            case 1:
                System.out.println("Enter the exchange rate from dollars to RMB :");
                double rmb = sc.nextDouble();
                System.out.println(rmb + " yuan is $" + rmb/exRate);
                break;
            default:
                System.out.println("Incorrect input");
                break;
                
            }
            sc.close();
    }
}
