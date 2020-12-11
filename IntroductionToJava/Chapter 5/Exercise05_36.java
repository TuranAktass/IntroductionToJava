import java.util.Scanner;
public class Exercise05_36 {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int isbn;
        int [] d = new int[9];
        int checkSum = 0;

        System.out.print("Enter the first 9 digits of an ISBN an integer :");
        isbn = input.nextInt();
        int isbnClone = isbn;

        for(int i = 8; i >= 0; i--){
            d[i] = isbn % 10;
            isbn /= 10;
            checkSum += d[i] * (i + 1);
        }
        checkSum %= 11;

        if(isbn == 0){
            if(checkSum == 10)
                System.out.print("The ISBN number is 0" + isbnClone + "X");
            else
                System.out.print("The ISBN number is 0" + isbnClone +"" + checkSum);
        }
        else{
            if(checkSum == 10)
                System.out.print("The ISBN number is " + isbnClone + "X");
            else
                System.out.print("The ISBN number is " + isbnClone + "" +checkSum);
        }

    input.close();

    }
}
