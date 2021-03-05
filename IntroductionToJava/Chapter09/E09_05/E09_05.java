import java.util.GregorianCalendar;

public class E09_05 {

	public static void main(String args[]) {
		GregorianCalendar newCal = new GregorianCalendar();

		System.out.print("Current Date : ");
		System.out.print(newCal.get(GregorianCalendar.YEAR) + "/");
		System.out.print(newCal.get(GregorianCalendar.MONTH) + "/");
		System.out.print(newCal.get(GregorianCalendar.DAY_OF_MONTH));
		;
		newCal.setTimeInMillis(1234567898765L);

		System.out.print("\nNew Date : ");
		System.out.print(newCal.get(GregorianCalendar.YEAR) + "/");
		System.out.print(newCal.get(GregorianCalendar.MONTH) + "/");
		System.out.print(newCal.get(GregorianCalendar.DAY_OF_MONTH));
	}
}
