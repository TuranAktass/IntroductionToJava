import java.util.Scanner;

public class Exercise7 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long minutes,years,days;
        System.out.println("Enter the number of minutes : ");
        minutes = sc.nextInt();
        days = (minutes/60)/24;
        years = days/365;
        days = days%365;
        System.out.println(minutes + "minutes is approximately " + years + " years and " + days + " days");
        sc.close();
    }
    
}
