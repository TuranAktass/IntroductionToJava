public class E09_08 {

	public static void main(String args[]) {
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();

		fan1.setSpeed(Fan.FAST);
		fan1.setRadius(10.0);
		fan1.setColor("yellow");
		fan1.setOn(true);

		fan2.setSpeed(Fan.SLOW);
		fan2.setOn(false);

		System.out.println("Fan1 : " + fan1.toString());
		System.out.println("Fan2 : " + fan2.toString());
	}
}
