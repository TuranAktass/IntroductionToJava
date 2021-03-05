import java.util.Random;

public class E09_04 {

	public static void main(String args[]) {
		Random rnd = new Random(1000);

		for (int i = 0; i < 50; i++) {
			System.out.println(rnd.nextInt(100));
		}
	}
}
