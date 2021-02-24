import java.util.Scanner;
public class Exercise05_46 {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = input.nextLine();
        String strCopy = "";
        
        for(int i = str.length() - 1; i >= 0; i--){
            strCopy += str.charAt(i); 
        }

        System.out.println("Reversed String : " + strCopy);

        input.close();
    }
}
