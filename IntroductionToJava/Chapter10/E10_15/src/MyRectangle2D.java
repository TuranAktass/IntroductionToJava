public class MyRectangle2D {

	private double x;
	private double y;
	private double width;
	private double height;

	public MyRectangle2D() {
		this(0, 0, 1, 1);
	}

	public MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return height * width;
	}

	public double getPerimeter() {
		return 2 * (height + width);
	}

	public boolean contains(double x, double y) {
		boolean xValid = x <= (this.x + (width / 2.0)) && x >= (this.x - (width / 2.0));
		boolean yValid = y <= (this.y + (height / 2.0)) && y >= (this.y - (height / 2.0));

		return xValid && yValid;
	}

	public boolean contains(MyRectangle2D rectangle) {
		double[][] corners = getCorners(rectangle);

		for (int i = 0; i < corners.length; i++) {
			if (!contains(corners[i][0], corners[i][1])) {
				return false;
			}
		}

		return true;
	}

	public boolean overlaps(MyRectangle2D rectangle) {
		double[][] corners = getCorners(rectangle);
		int counter = 0;

		for (int i = 0; i < corners.length; i++) {
			if (contains(corners[i][0], corners[i][1])) {
				counter++;
			}
		}

		if (counter > 0 && counter < 4) {
			return true;
		}

		else {
			return false;
		}
	}

	public double[][] getCorners(MyRectangle2D rectangle) {
		double corner1X = rectangle.getX() - (rectangle.getWidth() / 2);
		double corner1Y = rectangle.getY() + (rectangle.getHeight() / 2);

		double corner2X = rectangle.getX() + (rectangle.getWidth() / 2);
		double corner2Y = rectangle.getY() + (rectangle.getHeight() / 2);

		double corner3X = rectangle.getX() + (rectangle.getWidth() / 2);
		double corner3Y = rectangle.getY() - (rectangle.getHeight() / 2);

		double corner4X = rectangle.getX() - (rectangle.getWidth() / 2);
		double corner4Y = rectangle.getY() - (rectangle.getHeight() / 2);

		double[][] corners = { { corner1X, corner1Y }, { corner2X, corner2Y }, { corner3X, corner3Y },
				{ corner4X, corner4Y } };

		return corners;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
