public class E10_01 {
	public static void main(String args[]) {
		Time a = new Time();
		Time b = new Time(555550000);

		System.out.println("Time a : " + a.getHour() + ":" + a.getMinute() + ":" + a.getSecond());
		System.out.println("Time b : " + b.getHour() + ":" + b.getMinute() + ":" + b.getSecond());
	}
}
