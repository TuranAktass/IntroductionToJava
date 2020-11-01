import java.util.Scanner;
public class Exercise14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            int coin = (int)(Math.random() * 2);

        System.out.println("Head or Tail (1 for head abd 0 for tail)");
        int input = sc.nextInt();

        if(input == coin)
            System.out.println("Your guess is correct");
        else
            System.out.println("Your guess is incorrect");
        }
        sc.close();

    }
    
}
