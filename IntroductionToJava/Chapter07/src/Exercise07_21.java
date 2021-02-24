import java.util.Scanner;

public class Exercise07_21 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of balls to drop :");
		int numberOfBalls = input.nextInt();

		System.out.println("Enter the number of slots in the bean machine : ");
		int numberOfSlots = input.nextInt();

		int[] slots = new int[numberOfSlots];

		game(numberOfBalls, slots);
		
		input.close();
	}

	public static String path(int nBalls, int[] slots) {
		String path = "";

		for (int i = 0; i < slots.length - 1; i++) {
			int random = (int) (Math.random() * 2) + 1;

			if (random == 1)
				path += "L";
			else if (random == 2)
				path += "R";
		}

		return path;
	}

	public static void game(int nBalls, int[] slots) {

		for (int i = 0; i < nBalls; i++) {
			String path = path(nBalls, slots);
			System.out.println(path);
			int counter = rCounter(path, slots);

			slots[counter]++;
		}

		for (int i = 0; i < slots.length; i++) {
			System.out.println("Slot[" + i + "] : " + slots[i]);
		}
		
		drawHistogram(slots);
	}

	public static int rCounter(String path, int[] slots) {
		int counter = 0;

		for (int i = 0; i < slots.length - 1; i++) {
			if (path.charAt(i) == 'R')
				counter++;
		}

		return counter;
	}

	public static void drawHistogram(int[] slots) {
		
		
	}

}

