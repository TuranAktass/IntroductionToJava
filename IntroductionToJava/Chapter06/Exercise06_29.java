public class Exercise06_29 {
    
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static void twinPrime(){

        for(int i = 3; i < 1_000; i++){

            if(isPrime(i) && isPrime(i + 2)){
                System.out.printf("(%d, %d)\n" , i , i + 2);
            }
        }
    }

    public static void main(String args[]){

        twinPrime();

    }
}
