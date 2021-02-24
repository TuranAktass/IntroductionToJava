import java.util.Scanner;
public class Exercise04_20{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input = sc.next();
        System.out.println("Length : " + input.length());
        System.out.println("First Character : " + input.charAt(0));
        sc.close();
    }
}