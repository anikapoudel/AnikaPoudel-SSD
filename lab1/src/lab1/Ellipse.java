package lab1;

public class Ellipse extends Rectangle{
	public Ellipse(int width, int height) {
		super(width, height);
		this.numOfSides = 0;
		
	}
	public double getArea() {
		return 3 * width * height;
	}
}
