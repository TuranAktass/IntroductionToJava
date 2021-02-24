import java.util.Scanner;

public class Exercise20 {
   
    public static void main(String args[]) {
        double temp, wSpeed, wChill;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58F and 41F : ");
        temp = sc.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour ");
        wSpeed = sc.nextDouble();

        if ((temp < -58 || temp > 41) && (wSpeed < 2))
            System.out.println("The input is invalid! The temperature and the wind speed are not in the range!");
        else if (temp < -58 || temp > 41)
            System.out.println("The input is invalid! The temperature is not in the range!");
        else if (wSpeed < 2)
            System.out.println("The input is invalid! The wind speed must be greater than or equal to 2!");
        else {
            wChill = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(wSpeed, 0.16))
                    + (0.4275 * (temp) * (Math.pow(wSpeed, 0.16)));
            System.out.println("The wind chill index is : " + wChill);
        }

        sc.close();

    }

}
