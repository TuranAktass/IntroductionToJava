import java.util.Scanner;

public class E12_08 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a hex value : ");
		String hexValue = input.next();

		System.out.println("Decimal value of " + hexValue + " : " + hex2Dec(hexValue));
		
		input.close();
	}

	public static int hex2Dec(String hex) {
		for (int i = 0; i < hex.length(); i++) {
			char ch = hex.charAt(i);

			if (!(ch >= 'A' && ch <= 'F') && (ch >= '0' && ch <= '9')) {
				throw new NumberFormatException();
			}
		}

		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}

		return decimalValue;
	}

	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else
			return ch - '0';
	}
}
