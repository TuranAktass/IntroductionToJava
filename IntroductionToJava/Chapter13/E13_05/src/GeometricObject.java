import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	
	protected GeometricObject() {
		dateCreated = new Date();
	}
	
	protected GeometricObject(String color, boolean filled) {
		this.filled = filled;
		this.color = color;
		dateCreated = new Date();
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public static GeometricObject max(GeometricObject a, GeometricObject b) {
		if(a.compareTo(b) == -1) {
			return b;
		}
		
		return a;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	@Override 
	public int compareTo(GeometricObject o) {
		if(getArea() > o.getArea()) {
			return 1;
		}	else if(getArea() < o.getArea()) {
			return -1;
		}
		
		return 0;
	}
	
	@Override 
	public String toString() {
		return "created on: " + dateCreated + "\ncolor: " + color + "\nfilled: " + filled;
	}
}
