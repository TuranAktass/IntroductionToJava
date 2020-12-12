import java.util.Scanner;

public class Exercise05_51 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string : ");
        String str1 = input.nextLine();
        System.out.print("Enter the second string : ");
        String str2 = input.nextLine();

        String commonStr = "";

        if (str1.length() >= str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == str2.charAt(i))
                    commonStr += "" + str1.charAt(i);
                else
                    break;
            }
        } 
        else {
            for (int i = 0; i < str2.length(); i++) {
                if (str2.charAt(i) == str1.charAt(i))
                    commonStr += "" + str2.charAt(i);
                else
                    break;
            }
        }

        System.out.println("The common prefix is : " + commonStr);

        input.close();
    }

}
