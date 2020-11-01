import java.util.Scanner;
public class Exercise2{
    public static void main(String args[]){
        //listing 3.1 AdditionQuizz
        Scanner sc = new Scanner(System.in);
        int number1 = (int) (System.currentTimeMillis()%10);
        int number2 = (int) (System.currentTimeMillis()/ 7 % 10);
        int number3 = (int)(System.currentTimeMillis()/ 2 % 10);
        System.out.println(
            "What is "+number1+" + " + number2 + " + " +number3 +"?");
        int answer = sc.nextInt();
        sc.close();
        System.out.println(
            number1 +" + " +number2 +" + "+number3+" = "+answer +" is "+ 
            (number1+number2+number3==answer));
        
    }
}