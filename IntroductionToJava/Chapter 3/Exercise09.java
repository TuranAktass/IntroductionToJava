import java.util.Scanner;
public class Exercise09 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int isbn;
        int d1,d2,d3,d4,d5,d6,d7,d8,d9,checksum;
        System.out.println(
            "Enter the first 9 digits of an ISBN as an integer");
        isbn = sc.nextInt();
        int isbnClone = isbn;
        sc.close();

        d9 = isbn%10;
        isbn /= 10;
        d8 = isbn%10;
        isbn /= 10;
        d7 = isbn%10;
        isbn /= 10;
        d6 = isbn%10;
        isbn /= 10;
        d5 = isbn%10;
        isbn /= 10;
        d4 = isbn%10;
        isbn /= 10;
        d3 = isbn%10;
        isbn /= 10;
        d2 = isbn%10;
        isbn /= 10;
        d1 = isbn%10;
        isbn /= 10;

        checksum = ((d1*1) + (d2*2) + (d3*3) + (d4*4) + (d5*5) + (d6*6) + 
        (d7*7) + (d8*8) + (d9*9)) % 11;

        if(isbn == 0){
            if(checksum == 10){
                System.out.print("The ISBN number is 0" + isbnClone + "X");
            }
            else
                System.out.print("The ISBN number is 0" + isbnClone + "" +checksum);
        }
        else{
            if(checksum == 10){
                System.out.print("The ISBN number is " + isbnClone + "X");
            }
            else
                System.out.print("The ISBN number is " + isbnClone + "" +checksum);
    
    
        }
        

        

    }
    
}

