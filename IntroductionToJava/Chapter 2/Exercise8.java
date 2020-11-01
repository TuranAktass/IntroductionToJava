import java.util.Scanner;
public class Exercise8{
    public static void main(String[] args) {

        int gmt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT : ");
        gmt = sc.nextInt();
        sc.close();

      long totalMilliseconds = System.currentTimeMillis();
      long totalSeconds = totalMilliseconds / 1000;
      long currentSecond = totalSeconds % 60;
      long totalMinutes = totalSeconds / 60 ;
      long currentMinute = totalMinutes % 60;  
      long totalHours = totalMinutes / 60;
      long currentHour = totalHours % 24;
      currentHour +=gmt;
      System.out.println("Current time is " + currentHour + ":"
        + currentMinute + ":" + currentSecond + " GMT");
    }
  }