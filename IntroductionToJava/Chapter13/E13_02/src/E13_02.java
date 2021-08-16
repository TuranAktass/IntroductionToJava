import java.util.ArrayList;

public class E13_02 {

	public static void main(String args[]) {
		ArrayList<Number> list = new ArrayList<>();
		
		for(int i = 0; i < 20; i++) {
			list.add(i);
		}
		
		printList(list);
		
		System.out.println("\n\nAfter shuffle: ");
		
		shuffle(list);
		printList(list);
	}
	
	public static void shuffle(ArrayList<Number> list) {
		int n = list.size();
		
		for(int i = 0; i < n; i++) {
			int rn = (int) (Math.random() * n);
			
			Number temp = list.get(i);
			list.set(i, list.get(rn));
			list.set(rn,  temp);
			
		}
	}
	
	public static void printList(ArrayList<Number> list) {		
		for(int i = 0; i < list.size(); i++) {
			if(i % 10 == 0) {
				System.out.println();
			}
			
			System.out.print(list.get(i) + " - ");
		}
	}
}
