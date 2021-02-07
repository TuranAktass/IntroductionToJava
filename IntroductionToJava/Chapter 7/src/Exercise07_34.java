import java.util.Scanner;

public class Exercise07_34 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string :");
		String str = input.next();

		System.out.println(sort(str));

		input.close();
	}

	public static String sort(String s) {
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length - 1; i++) {
			char min = ch[i];
			int minIndex = i;

			for (int j = i + 1; j < ch.length; j++) {
				if ((int)ch[j] < (int)min) {
					min = ch[j];
					minIndex = j;
				}
			}

			if (minIndex != i) {
				ch[minIndex] = ch[i];
				ch[i] = min;
			}
		}

		s = "";

		for (int i = 0; i < ch.length; i++) {
			s += ch[i];
		}
		
		return s;
	}

}
