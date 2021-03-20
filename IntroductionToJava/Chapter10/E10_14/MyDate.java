import java.util.GregorianCalendar;

public class MyDate {
	private int year;
	private int month;
	private int day;

	public MyDate() {
		this(System.currentTimeMillis());
	}

	public MyDate(long elapsedTime) {
		GregorianCalendar cal = new GregorianCalendar();

		cal.setTimeInMillis(elapsedTime);

		this.year = cal.get(GregorianCalendar.YEAR);
		this.month = cal.get(GregorianCalendar.MONTH);
		this.day = cal.get(GregorianCalendar.DAY_OF_MONTH);
	}

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void setDate(long elapsedTime) {
		GregorianCalendar cal = new GregorianCalendar();

		cal.setTimeInMillis(elapsedTime);

		this.year = cal.get(GregorianCalendar.YEAR);
		this.month = cal.get(GregorianCalendar.MONTH);
		this.day = cal.get(GregorianCalendar.DAY_OF_MONTH);
	}

	public void printDate() {
		System.out.print(day + "/" + (month + 1) + "/" + year);
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

}
