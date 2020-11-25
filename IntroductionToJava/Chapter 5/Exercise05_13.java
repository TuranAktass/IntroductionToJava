
public class Exercise05_13 {
	/*
	 * (Find the largestn such that n3612,000) Use a while loop to find the largest
	 * integer n such that n3 is less than 12,000.
	 */
	public static void main(String args[]) {

		int n = 0;

		while (Math.pow(n + 1, 3) < 12000) {
			n++;
		}

		System.out.println("N = " + n);
	}

}
