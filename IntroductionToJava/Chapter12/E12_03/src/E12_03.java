import java.util.Scanner;

public class E12_03 {

	public static void main(String args[]) {
		try {
			Scanner input = new Scanner(System.in);

			System.out.print("Enter an index : ");
			int index = input.nextInt();

			int[] array = createArray(100);

			System.out.println("array[" + index + "] : " + array[index]);
		} catch (Exception ex) {
			System.out.println("Out of Bounds!");
		}
	}

	public static int[] createArray(int size) {
		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = (int) (Math.random() * 100);
		}

		return array;
	}
}
