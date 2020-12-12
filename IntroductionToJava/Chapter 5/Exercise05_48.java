import java.util.Scanner;
public class Exercise05_48 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = input.nextLine();

        for(int i = 0; i < str.length(); i++){
            if(i % 2 == 0)
                System.out.print(str.charAt(i));
        }

        input.close();
    }
    
}
