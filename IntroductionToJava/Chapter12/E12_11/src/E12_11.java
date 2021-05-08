import java.io.*;
import java.util.*;

public class E12_11 {

	public static void main(String args[]) throws FileNotFoundException {

		if (args.length != 2) {
			System.out.println("Usage java removeText filename");
			System.exit(1);
		}

		File file = new File(args[1]);

		if (!file.exists()) {
			System.out.println("File " + args[1] + " can not found!");
			System.exit(2);
		}

		ArrayList<String> string = new ArrayList<>();

		try (Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				String str1 = input.nextLine();
				string.add(removeString(args[0], str1));
			}
		}

		try (PrintWriter output = new PrintWriter(file);) {
			for (int i = 0; i < string.size(); i++) {
				output.println(string.get(i));
			}
		}
	}

	public static String removeString(String str, String line) {
		StringBuilder sBuilder = new StringBuilder(line);

		int start = sBuilder.indexOf(str);
		int end = str.length();

		while (start >= 0) {
			end = start + end;
			sBuilder = sBuilder.delete(start, end);
			start = sBuilder.indexOf(str, start);
		}

		return sBuilder.toString();
	}

}
