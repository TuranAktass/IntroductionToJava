
public class Exercise05_05 {

	public static void main(String args[]) {

		final double POUNDS_PER_KILOGRAM = 2.2;

		System.out.println("Kilograms \t Pounds  |  Pounds \t Kilograms");

		for (int i = 1, j = 20; i < 201 && j < 520; i += 2, j += 5) {
			System.out.printf("%-14d%9.1f", i, i * POUNDS_PER_KILOGRAM);
			System.out.printf("\t | \t");
			System.out.printf("%-4d%14.1f\n", j, j / POUNDS_PER_KILOGRAM);
		}

	}

}
