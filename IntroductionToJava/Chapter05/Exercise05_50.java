import java.util.Scanner;
public class Exercise05_50 {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = input.nextLine();
        int counter = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) <= 90 && str.charAt(i) >= 65)
                counter++;
        }

        System.out.println("The number of uppercase letters is " + counter);

        input.close();
    }

}
