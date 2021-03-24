import java.util.Scanner;

public class E11_10 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		MyStack StringStack = new MyStack();

		System.out.println("Enter five strings");
		for (int i = 0; i < 5; i++) {
			String s = input.nextLine();

			StringStack.add(s);
		}

		for (int i = 4; i >= 0; i--) {
			System.out.print(StringStack.get(i) + " ");
		}
	}
}
