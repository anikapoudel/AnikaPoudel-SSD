package lab1;

public  class Rectangle extends Shape{
	protected int width;
	protected int height;
	protected int numOfSides;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		this.numOfSides = 4;
	
	}
	//  Getters and Setters for width and height

	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	public int getNumOfSides() {
		return numOfSides;
	}
	
	@Override
	public double getArea() {
		return width*height;
	}
	
	public String toString() {
		return "Width: " + width + ", Height: " + height + ", Area: " + getArea() + ", Sides: " + numOfSides;

	}

}
