
public class Exercise05_15 {

	public static void main(String args[]) {

		int counter = 1;

		for (int i = 33; i < 127; i++) {

			System.out.print((char) (i) + " ");
			counter++;

			if (counter % 10 == 0)
				System.out.print("\n");
		}

	}

}
