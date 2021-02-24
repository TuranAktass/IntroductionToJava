import java.util.Scanner;
public class Exercise14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double weight,height,bmi;
        System.out.println("Enter weight in pounds : ");
        weight = sc.nextDouble();
        weight = weight * 0.45359237;
        System.out.println("Enter height in inches : ");
        height = sc.nextDouble();
        height = height * 0.0254;
        sc.close();
        bmi = weight / (height * height);
        System.out.println("BMI : " + bmi);

    }
    
}
