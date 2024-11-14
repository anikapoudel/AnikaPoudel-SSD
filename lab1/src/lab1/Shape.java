package lab1;

public abstract class Shape {
	 private int sides;
	 public int getSides() {
		 return sides;
	 }
	 public void setSides(int sides) {
		 this.sides = sides;
	 }

		public Shape() {
			
		}
		 abstract public double getArea();
		 Shape(int sides) {
			 this.sides = sides;

		 }

}
