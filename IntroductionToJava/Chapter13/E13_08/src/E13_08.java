
public class E13_08 {

	public static void main(String args[]) throws CloneNotSupportedException {
		MyStack list = new MyStack();
		
		for(int i = 0; i < 10; i++) {
			list.push(i);
		}
		
		MyStack copyList = (MyStack)list.clone();
		
		System.out.println("list-> " + list);
		System.out.println("copyList-> " + copyList);
	}
}
