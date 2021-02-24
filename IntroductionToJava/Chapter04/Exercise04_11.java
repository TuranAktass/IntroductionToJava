import java.util.Scanner;
public class Exercise04_11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15) : ");
        int decimal = sc.nextInt();
        if(decimal > 15)
            System.out.println(decimal + " is an invalid input!");
        else if(decimal < 10)
            System.out.println("The hex value is " + Integer.toString(decimal));
        else{
            System.out.println("The hex value is " + (char)(decimal + 'A' - 10));
        }
        sc.close();
            
    }
    }
