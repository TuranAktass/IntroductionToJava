
public class Exercise05_04 {

	public static void main(String args[]) {

		final double MILES_PER_KILOMETERS = 1.609;

		System.out.println("Miles \t  Kilometers");

		for (int i = 0; i < 11; i++) {
			System.out.printf("%-14d%6.1f\n", i, (i * MILES_PER_KILOMETERS));
		}
	}

}
