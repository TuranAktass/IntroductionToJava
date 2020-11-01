import java.util.Scanner;
public class Exercise17{
    public static void main(String args[]){
        double temp,wSpeed,wChill;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58F and 41F : ");
        temp = sc.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour ");
        wSpeed = sc.nextDouble();
        wChill = 35.74 + (0.6215 * temp) -(35.75 * Math.pow(wSpeed, 0.16)) + (0.4275 * (temp) * (Math.pow(wSpeed,0.16)));
        System.out.println("The wind chill index is : "+ wChill);
        sc.close();
        

    }
}