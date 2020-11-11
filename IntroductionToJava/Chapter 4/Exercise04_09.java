import java.util.Scanner;
public class Exercise04_09 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a character :");
    char ch = sc.nextLine().charAt(0);
    System.out.println("The unicode for character " + ch + " is " + (int)ch);
    sc.close();

    }
    
}
