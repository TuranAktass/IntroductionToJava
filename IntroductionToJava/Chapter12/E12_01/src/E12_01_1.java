public class E12_01_1 {

	public static void main(String args[]) {
		if (args.length != 3) {
			System.out.println("Usage : operand1 operator operand2");
			System.exit(1);
		}

		if (!isNumber(args[0])) {
			System.out.println("Wrong Input : " + args[0]);
			System.exit(2);
		}

		if (!isNumber(args[2])) {
			System.out.println("Wrong Input : " + args[2]);
			System.exit(3);
		}

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[2]);
		int result = 0;

		switch (args[1].charAt(0)) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '.':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		}

		System.out.println(a + " " + args[1] + " " + b + " = " + result);
	}

	public static boolean isNumber(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) {
				return false;
			}
		}

		return true;
	}
}
