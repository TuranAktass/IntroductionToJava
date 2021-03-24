import java.util.Scanner;
import java.util.ArrayList;

public class E11_11 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter five integers: ");

		for (int i = 0; i < 5; i++) {
			list.add(input.nextInt());
		}

		sort(list);

		System.out.println(list.toString());
		
		input.close();
	}

	public static void sort(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - i - 1; j++) {

				if (list.get(j) > list.get(j + 1)) {

					int temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);

				}

			}
		}
	}
}
