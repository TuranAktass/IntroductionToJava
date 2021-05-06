import java.io.*;

public class E12_01 {

	public static void main(String args[]) throws IOException {
		if (args.length != 3) {
			System.out.println("Usage : operand1 operator operand2");
			System.exit(1);
		}
		try {
			Integer.parseInt(args[0]);
		} catch (Exception ex) {
			System.out.println("Wrong input : " + args[0]);
			System.exit(2);
		}

		try {
			Integer.parseInt(args[2]);
		} catch (Exception ex) {
			System.out.println("Wrong input : " + args[2]);
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
}
