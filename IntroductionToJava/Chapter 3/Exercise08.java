import java.util.Scanner;
public class Exercise8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number1,number2,number3;

        System.out.print("Enter three integers : ");
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        number3 = sc.nextInt();
        sc.close();

        if(number1<number2 && number1<number3){
            if(number2<number3)
                System.out.println(number1 + " < " + number2 + " < " + number3);
            else
                System.out.println(number1 + " < " + number3 + " < " + number2);

        }
        else if(number2<number1 && number2<number3){
            if(number1<number3)
                System.out.println(number2 + " < " + number1 + " < " + number3);
            else
                System.out.println(number2 + " < " + number3 + " < " + number1);
        }
        else if(number3<number1 && number3<number2){
            if(number1<number2)
                System.out.println(number3 + " < " + number1 + " < " + number2);
            else
                System.out.println(number3 + " < " + number2 + " < " + number1);
            }



        

    }
    
}
