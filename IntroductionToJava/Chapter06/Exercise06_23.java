import java.util.Scanner;
public class Exercise06_23 {
    
    public static int count(String str, char a){
        int counter = 0;

        for(int i = 0; i < str.length(); i++){
            
            if(str.charAt(i) == a)
                counter++;
            
        }

        return counter;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = input.nextLine();
        System.out.println("Enter a char : ");
        char a = input.next().charAt(0);

        System.out.println("Occurrences : " + count(str, a));

        input.close();
    }
}
