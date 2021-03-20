public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time() {
		this(System.currentTimeMillis());
	}

	public Time(long elapsedTime) {
		this((int) (elapsedTime / 3_600_000) % 24, (int) (elapsedTime / 60_000) % 60, (int) (elapsedTime / 1_000) % 60);
	}

	public Time(int h, int m, int s) {
		this.hour = h;
		this.minute = m;
		this.second = s;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void setTime(long elapsedTime) {
		hour = (int) ((elapsedTime / 3_600_000) % 24);
		minute = (int) ((elapsedTime / 60_000) % 60);
		second = (int) ((elapsedTime / 1_000) % 60);
	}
}
