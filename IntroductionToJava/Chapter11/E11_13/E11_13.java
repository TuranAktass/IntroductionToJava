import java.util.Scanner;
import java.util.ArrayList;

public class E11_13 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Enter ten integers: ");
		for (int i = 0; i < 10; i++) {
			list.add(input.nextInt());
		}

		removeDuplicates(list);

		System.out.println(list.toString());

		input.close();
	}

	public static void removeDuplicates(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {

				if (list.get(i) == list.get(j) && i != j) {
					list.remove(j);
				}
			}
		}
	}

}
