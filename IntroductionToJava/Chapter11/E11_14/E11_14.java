import java.util.Scanner;
import java.util.ArrayList;

public class E11_14 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		System.out.println("Enter five integers for list1");
		for (int i = 0; i < 5; i++) {
			list1.add(input.nextInt());
		}

		System.out.println("Enter five integers for list2");
		for (int i = 0; i < 5; i++) {
			list2.add(input.nextInt());
		}

		System.out.println("The combined list is " + union(list1, list2).toString());

		input.close();
	}

	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> combinedList = new ArrayList<>();

		for (int i = 0; i < list1.size(); i++) {
			combinedList.add(list1.get(i));
		}

		for (int i = 0; i < list2.size(); i++) {
			combinedList.add(list2.get(i));
		}

		return combinedList;
	}
}
