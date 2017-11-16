package project;

public class Point {

	private double x;
	private double z;

	public Point(double x, double z) {
		this.x = x;
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	
	public String toString() {
		return "x=" + x + "\t z=" + z;
	}
}
