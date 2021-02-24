public class Exercise06_05{

    public static void displaySortedNumbers(double num1, double num2, double num3){
        double temp = 0.0;

        while(num1 > num2 || num2 > num3 || num1 > num3){
            if(num1 > num2){
                temp = num2;
                num2 = num1;
                num1 = temp;
            }
    
            if(num2 > num3){
                temp = num3;
                num3 = num2;
                num2 = temp;
            }
    
            if(num1 > num3){
                temp = num3;
                num3 = num1;
                num1 = temp;
            }
        }
        System.out.println(num1 + " < " + num2 + " < " + num3);
    }

    public static void main(String args[]){
        displaySortedNumbers(20,30,10);
    }
}