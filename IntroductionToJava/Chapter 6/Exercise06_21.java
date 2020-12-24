import java.util.Scanner;
public class Exercise06_21 {

    int getNumber(char upperCaseLetter){
        return 1;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = input.nextLine();

        str = str.toUpperCase();

        input.close();
    }
    
}
