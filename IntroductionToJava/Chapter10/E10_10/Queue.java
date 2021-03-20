public class Queue {
	private int [] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 8;
	
	public Queue() {
		this(DEFAULT_CAPACITY);
	}
	
	public Queue(int capacity) {
		elements = new int[capacity];
	}
	
	public void enqueue(int v) {
		if(size >= elements.length) {
			int [] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		
		elements[size++] = v;
	}
	
	public void dequeue() {
		for(int i = 0; i < elements.length - 1; i++) {
			elements[i] = elements[i + 1];
		}
		
		size--;
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		
		return false;
	}
	
	public int [] getQueue() {
		return elements;
	}
	
	public int getSize() {
		return size;
	}
	
	public void print() {
		for(int i = 0; i < size; i++) {
			System.out.print(elements[i] + " ");
		}
		
		System.out.println();
	}
}
