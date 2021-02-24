import java.util.Scanner;
public class Exercise05_49 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = input.nextLine();

        int vowels = 0;
        int consonants = 0;
        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' 
                || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                || str.charAt(i) == 'u')
                vowels++;

            else if(str.charAt(i) != 32)
                consonants++;
                
        }

        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants : " + consonants);

        input.close();
    }
    
}
