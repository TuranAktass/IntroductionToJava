import java.util.Scanner;

public class Exercise11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int population;
        int year;
        System.out.println("Enter the number of years : ");
        year = sc.nextInt();

        population = (year * (((365 * 24 * 60 * 60) / 7) + ((365 * 24 * 60 * 60) / 45)
                            - ((365 * 24 * 60 * 60) / 13)) + 312032486);
        sc.close();
        System.out.println("The population in 5 years is " + population);
    }
    
}
