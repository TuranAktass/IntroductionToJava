import java.util.Scanner;
public class Exercise04_19 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String isbn;
        int d1,d2,d3,d4,d5,d6,d7,d8,d9,checksum;
        System.out.println(
            "Enter the first 9 digits of an ISBN as an integer");
        isbn = sc.next();
        sc.close();
        

        d9 = Character.getNumericValue(isbn.charAt(8));
        d8 = Character.getNumericValue(isbn.charAt(7));
        d7 = Character.getNumericValue(isbn.charAt(6));
        d6 = Character.getNumericValue(isbn.charAt(5));
        d5 = Character.getNumericValue(isbn.charAt(4));
        d4 = Character.getNumericValue(isbn.charAt(3));
        d3 = Character.getNumericValue(isbn.charAt(2));
        d2 = Character.getNumericValue(isbn.charAt(1));
        d1 = Character.getNumericValue(isbn.charAt(0));
        

        checksum = ((d1*1) + (d2*2) + (d3*3) + (d4*4) + (d5*5) + (d6*6) + 
        (d7*7) + (d8*8) + (d9*9)) % 11;
        System.out.println(d1 + " " + d2 + " " + d3 + " " +d4+ " " + d5 + " "
        +d6 + " " + d7 + " " +d8 + " " +d9);

        

        
            if(checksum == 10){
                System.out.print("The ISBN number is " + isbn + "X");
            }
            else
                System.out.print("The ISBN number is " + isbn + "" +checksum);
    
    
        
        

        

    }
    
}

