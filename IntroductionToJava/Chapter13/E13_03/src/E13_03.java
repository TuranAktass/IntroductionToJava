import java.util.ArrayList;

public class E13_03 {

	public static void main(String args[]) {
		ArrayList<Number> list = new ArrayList<>();
		for(int i = 20; i > 0; i--) {
			list.add(i);
		}
		
		printList(list);
		
		System.out.println("\n\n sorted list: ");
		
		sort(list);
		printList(list);
	}

	public static void sort(ArrayList<Number> list) {
		boolean changed;
		do {
			changed = false;
			for(int i = 0; i < list.size() - 1; i++) {
				Number a = list.get(i);
				Number b = list.get(i + 1);
				
				if(a.doubleValue() > b.doubleValue()) {
					list.set(i, b);
					list.set(i + 1, a);
					changed = true;
				}
			
			}
		}while(changed);
	}

	public static void printList(ArrayList<Number> list) {

		for (int i = 0; i < list.size(); i++) {
			if (i % 10 == 0) {
				System.out.println();
			}

			System.out.print(list.get(i) + " ");
		}
	}
}
