import java.util.Scanner;
public class Exercise06 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds :");
        double weight = sc.nextDouble();

        System.out.print("\nEnter feet :");
        int feet = sc.nextInt();
        System.out.print("\nEnter inches :");
        int inches = sc.nextInt();
        sc.close();
        //1ft = 12inches
        double height = (feet * 12) + inches;

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double weightKg = weight * KILOGRAMS_PER_POUND;
        double heightM = height * METERS_PER_INCH;
        double bmi = weightKg / (heightM * heightM);

        System.out.println("BMI is " + bmi);

        if(bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if(bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

    }   
}
