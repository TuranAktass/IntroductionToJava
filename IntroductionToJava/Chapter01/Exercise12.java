public class Exercise12{
    public static void main(String args[]){
        /*
        Assume a runner runs 24 miles in 1 hour,40minutes and 35 seconds.
        Write a program that displays the average speed in kilometers per hour.
        1mile = 1.6 kilometers
        */
        System.out.println((60 * 60 * 24 * 1.6) / ((60 + 40) * 60 + 35));
    }
}