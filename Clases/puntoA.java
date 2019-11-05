package Clases;

public class puntoA {
	private double x;
	private double y;
	
	puntoA () {
		x=0;
		y=0;
	}

	puntoA (double x1,double y1) {
		x=x1;
		y=y1;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return x;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double getY() {
		return y;
	}
	
}
