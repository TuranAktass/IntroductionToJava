public class E12_09 {

	public static void main(String args[]) throws BinaryFormatException {
		System.out.println(bin2Dec("11101010"));
	}

	public static int bin2Dec(String binaryString) throws BinaryFormatException {
		for (int i = 0; i < binaryString.length(); i++) {
			char tempChar = binaryString.charAt(i);

			if (tempChar != '0' && tempChar != '1') {
				throw new BinaryFormatException("input must be a binary number");
			}
		}

		int decimal = Integer.parseInt(binaryString, 2);
		return decimal;
	}
}
