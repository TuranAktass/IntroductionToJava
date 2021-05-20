import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * (Replace text) Listing 12.16, ReplaceText.java, gives a program that replaces text in a
 *  source file and saves the change into a new file. Revise the program to save the change 
 *  into the original file. For example, invoking 
 *  java Exercise12_16 file oldString newString                                     
 *  replaces oldString in the source file with newString.
 */
public class E12_16 {

	public static void main(String args[]) throws FileNotFoundException {

		if (args.length != 3) {
			System.out.println("Usage java Exercise12_16 file oldString newString");
			System.exit(1);
		}

		File file = new File(args[0]);

		if (!file.exists()) {
			System.out.println("Source file " + args[0] + " does not exist");
			System.exit(2);
		}

		String str = "";

		try (Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				str += input.nextLine() + "\n";
			}
			str = str.replaceAll(args[1], args[2]);
		}

		try (PrintWriter output = new PrintWriter(file);) {
			output.print(str);
		}
	}
	// java E12_16 file.txt a 1
}
