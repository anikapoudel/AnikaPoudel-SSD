package lab1;

public class Hexagon extends Shape {
    private int Side; // defining the variable

    // Constructor with default number of sides for a hexagon
    public Hexagon() {
        super(6); // Assuming Shape class takes number of sides in its constructor
        this.Side = 0; // Default value for side length
    }

    // Constructor that sets the side length
    public Hexagon(int side) {
        super(6); // A hexagon has 6 sides
        this.Side = side; // Initialize Side with the provided value
    }

    // Getter for side
    public int getSide() { 
        return Side;
    }

    // Setter for side
    public void setSide(int Side) {
        this.Side = Side; // Correctly set the side length
    }

    // Perimeter of a hexagon: 6 * side length
    public int getPerimeter() {
        return 6 * Side;
    }

    // Area of a regular hexagon: (3 * sqrt(3) / 2) * side^2
    @Override
    public double getArea() {
        return (3 * Math.sqrt(3) / 2) * Side * Side;
    }

    @Override
    public String toString() {
        return "Perimeter: " + getPerimeter() + ", Area: " + getArea() +"Side: " + Side + "\n" 
;
    }
}
