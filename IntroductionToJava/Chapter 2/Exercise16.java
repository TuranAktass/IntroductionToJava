import java.util.Scanner;
public class Exercise16{
    public static void main(String args[]){
        double side,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side : ");
        side = sc.nextDouble();
        area = (((3*Math.sqrt(3))/2)*(side*side));
        System.out.println("The area of the hexagon is : " + area);
        sc.close();
        
        
	
	
    }
}