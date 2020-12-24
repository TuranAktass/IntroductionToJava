import java.util.Scanner;
public class Exercise06_20 {
    
    public static int countLetters(String str){
        int counter = 0;

        str = str.toUpperCase();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) > 64 && str.charAt(i) < 91)
                counter++;
        }

        return counter;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = input.nextLine();

        System.out.print("Number of letters in the string : " + countLetters(str));

        input.close();
    }
}
