import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class E12_15 {

	public static void main(String args[]) throws IOException {
		File file = new File("Exercise12_15.txt");

		try (FileWriter fileWriter = new FileWriter(file);) {

			for (int i = 0; i < 100; i++) {
				int number = (int) (Math.random() * 100);
				fileWriter.write(number + " ");
			}
		}

		try (Scanner input = new Scanner(file);) {
			List<Integer> list = new ArrayList<Integer>();

			while (input.hasNext()) {
				list.add(input.nextInt());
			}

			Collections.sort(list);

			for (int i = 0; i < list.size(); i++) {
				if (i % 10 == 0) {
					System.out.println();
				}

				System.out.print(list.get(i) + " ");
			}

		}
	}

}