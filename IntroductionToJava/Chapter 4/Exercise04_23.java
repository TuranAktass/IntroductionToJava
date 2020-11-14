import java.util.Scanner;

public class Exercise04_23 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee's name : ");
        String name = sc.next();
        System.out.print("Enter number of hours worked in a week : ");
        int workHours = sc.nextInt();
        System.out.print("Enter hourly pay rate : ");
        double payRate = sc.nextDouble();
        System.out.print("Enter federal tax withholding rate : ");
        double federalTax = sc.nextDouble();
        System.out.print("Enter state tax withholding rate : ");
        double stateTax = sc.nextDouble();

        System.out.println("Employee Name : " + name);
        System.out.println("Hour Worked : " + workHours);
        System.out.println("Pay Rate : $" + payRate);
        System.out.println("Gross Pay : $" + payRate * workHours);
        System.out.println("Deductions : ");
        System.out.println("\tFederal Withholding (" + federalTax + "%) : " + payRate * workHours * federalTax);
        System.out.println("\tState Withholding (" + stateTax + "%) : " + payRate * workHours * stateTax);
        System.out.println("Total Deduction : "
                + (workHours * payRate - ((payRate * workHours * stateTax) + (payRate * workHours * federalTax))));

        sc.close();

    }
}
