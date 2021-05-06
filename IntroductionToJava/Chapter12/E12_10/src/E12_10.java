import java.util.ArrayList;


public class E12_10 {

	public static void main(String args[]) {
		ArrayList <Integer> integerList =  new ArrayList<Integer>();
		Integer counter = 0;
		
		try{while(true) {
			integerList.add(counter);
			counter += 100;
		}} catch(OutOfMemoryError er) {
			System.out.println("out of memory");
		}
		
	}
}
