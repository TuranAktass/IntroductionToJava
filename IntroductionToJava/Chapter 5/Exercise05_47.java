import java.util.Scanner;
public class Exercise05_47 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 12 digits of an ISBN-13 as a string : ");
        long isbnNumber = input.nextLong();

        int i = 0;
        int sum = 0;
        String isbn13 = "" + isbnNumber;

        while(isbnNumber > 0){
            int remainder = (int) (isbnNumber % 10);
            
            if(isbnNumber % 2 == 0)
                sum += 3 * remainder;
            else
                sum += remainder;
            
            isbnNumber /= 10;
            
            i++;
        }

        int checkSum = (10 - (sum % 10));

        if(checkSum == 10)
            isbn13+= "" + 0;
        else
            isbn13 += "" + checkSum;
        
        System.out.println("ISBN-13 : " + isbn13);
    
        input.close();
    }
    
}
