package lab1;

public class Square extends Shape {
    private int side; // defining the variable

    // Constructor called from Shape
    public Square() { 
        super(4); // Assuming Shape class takes the number of sides in its constructor
        this.side = 0;  // Default value for side
    }

    public Square(int side) {
        super(4);  // A square always has 4 sides, so the number of sides is passed to the parent class
        this.side = side;  // Set the side length
    }

    // Getter for side
    public int getSide() { 
        return side;
    }

    // Setter for side
    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;  // Area of a square: side^2
    }
    
    public int getPerimeter() {
        return 4 * side;  // Perimeter of a square: 4 * side
    }

    @Override
    public String toString() {
        return "Square: Area = " + getArea() + "\n" +
               "Side: " + side + "\n" +
               "Perimeter: " + getPerimeter();
    }
}
