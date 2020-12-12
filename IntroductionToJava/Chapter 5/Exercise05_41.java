import java.util.Scanner;
public class Exercise05_41 {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int entry;
        int largest = 0;
        int largestOccurrence = 0;

        System.out.print("Enter an integer (0 for exit): ");

        do{
            entry = input.nextInt();

            if(entry == 0)
                continue;
            
            if(entry > largest){
                    largest = entry;
                    largestOccurrence = 1;
            }
            else if(entry == largest){
                largestOccurrence++;
            }
        } while(entry != 0);

        System.out.println("Largest : " + largest);
        System.out.println("Occurrence : " + largestOccurrence);

        input.close();    
    }

}
