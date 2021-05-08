import java.io.*;
import java.util.Scanner;

public class E12_13 {

	public static void main(String args[]) throws FileNotFoundException {
		if (args.length != 1) {
			System.out.println("Usage: java E12_13 Test.java");
			System.exit(1);
		}

		File file = new File(args[0]);

		if (!file.exists()) {
			System.out.println("File " + args[0] + " not found!");
			System.exit(2);
		}

		int numberOfChars = 0;
		int numberOfWords = 0;
		int numberOfLines = 0;

		try (Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				String str = input.next();
				numberOfChars += str.length();
				numberOfWords++;
			}
		}

		try (Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				input.nextLine();
				numberOfLines++;
			}
		}

		System.out.println("Number of characters in " + args[0] + ": " + numberOfChars);
		System.out.println("Number of words in " + args[0] + ": " + numberOfWords);
		System.out.println("Number of lines in " + args[0] + ": " + numberOfLines);
	}
}
