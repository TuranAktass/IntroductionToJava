public class Exercise05_18_03 {

	public static void main(String args[]) {

		for (int i = 1, space = 6; i <= 6; i++, space--) {

			for (int k = 1; k < space; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}