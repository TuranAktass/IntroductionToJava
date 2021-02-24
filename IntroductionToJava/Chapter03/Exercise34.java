import java.util.Scanner;
public class Exercise34 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1 and p2");
        double p0x = sc.nextDouble();
        double p0y = sc.nextDouble();
        double p1x = sc.nextDouble();
        double p1y = sc.nextDouble();
        double p2x = sc.nextDouble();
        double p2y = sc.nextDouble();
        sc.close();
        
        float distance = (float)(Math.sqrt((Math.pow(p0x-p1x,2)+Math.pow(p0y-p1y,2))));
        float firstHalf = (float)(Math.sqrt((Math.pow(p2x-p0x,2)+Math.pow(p2y-p0y,2))));
        float secondHalf = (float)(Math.sqrt((Math.pow(p1x-p2x,2)+Math.pow(p1y-p2y,2))));
        
        if(!(firstHalf + secondHalf > distance))
        System.out.println(
            "(" + p2x + ", " + p2y + ") is on the line segment from (" + p0x + ", " + p0y
        + ") to (" + p1x + ", " + p1x + ")");
        else
        System.out.println(
            "(" + p2x + ", " + p2y + ") is not on the line segment from (" + p0x + ", " + p0y
        + ") to (" + p1x + ", " + p1x + ")");
    
    }
    
}
