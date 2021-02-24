import java.util.Scanner;
public class Exercise1{
    /*
    Convert Celsius to Fahrenheit read a celsius degree in a double value and convert it to fahrenheit and display the result
    fahrenheit = (9/5) * celsius +32
    */ 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius : ");
        double celsius = sc.nextDouble();
        sc.close();
        double fahrenheit = (9.0/5.0) * celsius + 32;
        System.out.println("Fahrenheit : "+ fahrenheit);     
    }
}