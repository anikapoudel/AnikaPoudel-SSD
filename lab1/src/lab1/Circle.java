package lab1;

public class Circle extends Shape{
	private int radius;
	private int numOfSides;
	
	public Circle(int radius) {
		this.radius = radius;
		this.numOfSides = 0;

	}
    //Getters and Setters for radius.

	public int getRadius() {
		return radius;	
	}
	public void setRadius(int radius) {
		this.radius = radius; 
	}
	public int getNumOfSides() {
		return numOfSides;
	}
	public double getArea()
	{
		return Math.PI * radius *radius;
	}
	public String toString() {
		return "Radius: " + radius + ", Area: " + getArea() + ", Sides: " + numOfSides;

	}

	
}
