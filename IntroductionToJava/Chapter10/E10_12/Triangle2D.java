public class Triangle2D {
	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;
	
	public Triangle2D() {
		this.p1 = new MyPoint(0,0);
		this.p2 = new MyPoint(1,1);
		this.p3 = new MyPoint(2,5);
	}
	
	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public double getArea() {
		double s1 = distance(p1,p2);
		double s2 = distance(p2,p3);
		double s3 = distance(p3,p1);
		
		double s = (s1 + s2 + s3) / 2.0;
		
		return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
	}
	
	public double getPerimeter() {
		double s1 = distance(p1,p2);
		double s2 = distance(p2,p3);
		double s3 = distance(p3,p1);
		
		return s1 + s2 + s3;
	}
	
	private static double distance(MyPoint a, MyPoint b) {
		double x1 = a.getX();
		double y1 = a.getY();
		double x2 = b.getX();
		double y2 = b.getY();
		
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
}
