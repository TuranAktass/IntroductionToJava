import java.util.Scanner;
public class Exercise10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number1,number2,sum;
        number1 = (int)(Math.random() * 100);
        number2 = (int)(Math.random() * 100);
        
        System.out.print(number1 + " + " + number2 + " = ");
        sum = sc.nextInt();
        sc.close();

        if(number1+number2 == sum)
            System.out.println("Your answer is correct!");
        else
            System.out.println("Your answer is wrong, correct answer is" + number1+number2);  
    }
    
}
