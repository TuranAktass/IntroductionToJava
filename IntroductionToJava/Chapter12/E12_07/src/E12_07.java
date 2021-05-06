import java.util.Scanner;

public class E12_07 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a binary number : ");
		String binary = input.next();

		System.out.println("Decimal value of " + binary + " : " + bin2Dec(binary));
	}

	public static int bin2Dec(String binaryString) {
		for (int i = 0; i < binaryString.length(); i++) {
			char digit = binaryString.charAt(i);

			if (digit < '0' || digit > '1') {
				throw new NumberFormatException();
			}
		}

		int dec_value = 0;
		int currentPow = binaryString.length() - 1;
		
		for (int i = 0; i < binaryString.length(); i++) {
			int currentDigit = Character.getNumericValue(binaryString.charAt(i));

			dec_value += currentDigit * Math.pow(2, currentPow);
			currentPow--;
		}

		return dec_value;
	}

}
