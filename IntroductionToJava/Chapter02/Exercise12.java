import java.util.Scanner;
public class Exercise12 {
    public static void main(String args[]){
        double acceleration,speed,length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter speed : ");
        speed = sc.nextDouble();
        System.out.print("\nEnter acceleration : ");
        acceleration = sc.nextDouble();
        sc.close();
        length = (speed * speed)/(2*acceleration);
        System.out.println("The minimum runway length for this airplane is " + length);
        

    }
    
}
