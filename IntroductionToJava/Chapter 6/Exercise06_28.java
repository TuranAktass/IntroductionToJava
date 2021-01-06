public class Exericse06_28 {

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]){
        System.out.println("p       2^p - 1");

        for(int i = 2; i <= 31; i++){
            if(isPrime(i)){
                int m = (int) (Math.pow(2,i) - 1);
                
                if(isPrime(m)){
                    System.out.printf("%-2d     %-5d\n", i , m);
                }
            }
        }
        
    }
    
}
