import java.util.Scanner;
public class Exercise05 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter today's day :");
        int today = sc.nextInt();
        System.out.print("\nEnter the number of days elapsed since today :");
        int days = sc.nextInt();
        
        System.out.print("\nToday is ");
        switch(today){
            case 0 :
                System.out.print("Monday");
                break;
            case 1 :
                System.out.print("Tuesday");
                break;
            case 2 :
                System.out.print("Wednesday");
                break;
            case 3 :
                System.out.print("Thursday");
                break;
            case 4 :
                System.out.print("Friday");
                break;
            case 5 :
                System.out.print("Saturday");
                break;
            case 6 :
                System.out.print("Sunday");
                break;
        }
        System.out.print(" and the future day is ");
        switch((today+days)%7){
            case 0 :
                System.out.print("Monday");
                break;
            case 1 :
                System.out.print("Tuesday");
                break;
            case 2 :
                System.out.print("Wednesday");
                break;
            case 3 :
                System.out.print("Thursday");
                break;
            case 4 :
                System.out.print("Friday");
                break;
            case 5 :
                System.out.print("Saturday");
                break;
            case 6 :
                System.out.print("Sunday");
                break;
        }

        sc.close();

    }
    
}
