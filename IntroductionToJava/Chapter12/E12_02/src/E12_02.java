import java.io.*;
import java.util.Scanner;

public class E12_02 {

	public static void main(String args[]) throws IOException {

		do {
			Scanner input = new Scanner(System.in);
			try {
				System.out.println("Enter two integers");
				int a = input.nextInt();
				int b = input.nextInt();

				System.out.println("SUM : " + (a + b));
				input.close();
			} catch (Exception ex) {
				input.reset();
				System.out.println("Wrong input");
				continue;
			}

			break;
		} while (true);

	}
}
