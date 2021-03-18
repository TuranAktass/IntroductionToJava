public class MyPoint {
	private double x;
	private double y;

	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double distance(MyPoint p2) {
		double p1X = getX();
		double p1Y = getY();
		double p2X = p2.getX();
		double p2Y = p2.getY();

		return Math.sqrt(Math.pow(p2X - p1X, 2) + Math.pow(p2Y - p1Y, 2));
	}

	public double distance(double p2X, double p2Y) {
		double p1X = getX();
		double p1Y = getY();

		return Math.sqrt(Math.pow(p2X - p1X, 2) + Math.pow(p2Y - p1Y, 2));
	}

}
