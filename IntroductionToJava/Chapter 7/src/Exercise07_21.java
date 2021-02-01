import java.util.Scanner;
public class Exercise07_21 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of balls to drop : ");
		int numberOfBalls = input.nextInt();
		
		System.out.println("Enter the number of slots in the bean machine : ");
		int numberOfSlots = input.nextInt();
		
		int [] slots = new int[numberOfSlots];
		
		for(int i = 0; i < numberOfBalls; i++) {
			String str = path();
			
			System.out.println(str);
			M2(slots, str);
		}
		
		for(int i = 0; i < slots.length; i++) {
			System.out.printf("Slot[%d] : %d \n" , i , slots[i]);
		}
	
		input.close();
	}
	
	public static String path() {		
		String result = "";
		
		for(int i = 0; i < 7; i++) {
			int random = (int)(Math.random() * 2) + 1;
			
			if(random == 1)
				result += "R";
			else if(random == 2)
				result += "L";
		}
		
		return result;
	}
	
	public static void M2 (int [] slots, String path) {
		int counter = 0;
		char [] array = new char[path.length()];
		array = path.toCharArray();
		
		for(int i = 0; i < slots.length; i++) {
			if(array[i] == 'R')
				counter++;
		}
		
		slots[counter]++;
	}
	
	public static void drawSlots(int [] slots) {
		
		for(int i = 0; i < slots.length; i++) {
			for(int j = 0; j < i; j++) {
				
			}
		}
	}
}
