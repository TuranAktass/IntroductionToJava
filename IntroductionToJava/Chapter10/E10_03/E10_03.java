
public class E10_03 {

	public static void main(String args[]) {
		char [] array = {'1' , '2' , '3'};
		
		MyInteger int1 = new MyInteger(10);
		MyInteger int2 = new MyInteger(10);
		
		System.out.println("int1 = " + int1.getValue());
		int1.getStatus();
		System.out.println("equals(10) : " + int1.equals(10));
		System.out.println("equals(int2) : " + int1.equals(int2));
		
		int int4 = MyInteger.parseInt(array);
		System.out.println(int4);
		
		int4 = MyInteger.parseInt("567");
		System.out.println(int4);
	}
}
