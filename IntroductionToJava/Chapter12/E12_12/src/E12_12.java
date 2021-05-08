import java.io.*;
import java.util.Scanner;

public class E12_12 {

	public static void main(String args[]) throws FileNotFoundException {
		if (args.length != 1) {
			System.out.println("Usage: java Exercise12_12 Test.java");
			System.exit(1);
		}

		File file = new File(args[0]);

		if (!file.exists()) {
			System.out.println("File " + args[0] + " not found");
			System.exit(2);
		}

		String str = "";

		try (Scanner input = new Scanner(file)) {
			while (input.hasNext()) {
				str += input.nextLine() + "\n";
			}

			str = str.replaceAll("\n\\s*\\{", " {");
		}

		try (PrintWriter output = new PrintWriter(file);) {
			output.print(str);
		}

	}
}
