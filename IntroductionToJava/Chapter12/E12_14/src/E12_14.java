import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class E12_14 {

	public static void main(String args[]) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter text file name: ");
		String fileName = input.nextLine();

		File file = new File(fileName);

		if (!file.exists()) {
			System.out.println("File not found!");
			System.exit(1);
		}

		int counter = 0;
		int total = 0;

		try (Scanner input2 = new Scanner(file)) {
			while (input2.hasNext()) {
				int score = input2.nextInt();
				counter++;
				total += score;
			}
		}

		System.out.println("Number of scores: " + counter);
		System.out.println("Total: " + total);
		System.out.println("Averaga: " + (double) (total / counter));

		input.close();
	}

}
