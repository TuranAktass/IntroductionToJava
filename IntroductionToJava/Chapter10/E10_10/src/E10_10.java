public class E10_10 {

	public static void main(String args[]) {
		Queue q1 = new Queue();
		
		for(int i = 0; i < 20; i++) {
			q1.enqueue(i);
		}
		q1.print();
		
		System.out.println("q1.getSize() : " + q1.getSize());
		System.out.println("q1.isEmpty() : " + q1.isEmpty());
		
		for(int i = 0; i < 20; i++) {
			q1.dequeue();
		}
		
		System.out.println();
		System.out.println("q1.getSize() : " + q1.getSize());
		System.out.println("q1.isEmpty() : " + q1.isEmpty());
	}
	
}
