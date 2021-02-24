import java.util.Scanner;
public class Exercise04_22 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string str1 :");
        String str1 = sc.next();
        System.out.print("\nEnter string str2 :");
        String str2 = sc.next();

        if(str1.contains(str2) == true)
            System.out.println(str2 +" is a substring of " + str1);
        else
            System.out.println(str2 + " is not a substring of " + str1);
        sc.close();
    }
}
