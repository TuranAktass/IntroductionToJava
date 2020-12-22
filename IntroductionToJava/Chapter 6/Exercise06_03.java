public class Exercise06_03 {

    public static int reverse(int n) {
        String reverseNumber = "";

        while (n != 0) {
            reverseNumber += (n % 10);
            n /= 10;
        }

        int x = Integer.parseInt(reverseNumber);
        return x;
    }

    public static boolean isPalindrome(int n) {
        if (n == reverse(n))
            return true;

        return false;
    }

    public static void main(String args[]) {
        System.out.println("isPalindrome(123) : " + isPalindrome(123));
        System.out.println("isPalindrome(1234) : " + isPalindrome(1234));
        System.out.println("isPalindrome(202) : " + isPalindrome(202));
        System.out.println("isPalindrome(1001) : " + isPalindrome(1001));
        System.out.println("isPalindrome(121) : " + isPalindrome(121));
    }

}
