
public class Exercise05_06 {

	public static void main(String args[]) {

		final double MILES_PER_KILOMETERS = 1.609;

		System.out.println("Miles \t Kilometers |Kilometers \t Miles");

		for (int i = 1, j = 20; i < 11 && j < 65; i++, j += 5) {
			System.out.printf("%-14d%5.1f", i, i * MILES_PER_KILOMETERS);
			System.out.printf(" | ");
			System.out.printf("%-19d%5.1f\n", j, j / MILES_PER_KILOMETERS);
		}
		
	}

}
