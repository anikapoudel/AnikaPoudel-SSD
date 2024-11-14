package lab1;

public class Triangle extends Shape {

    private int height; // defining the variables
    private int breadth;

    // Constructor that sets the number of sides and initializes height and breadth
    public Triangle() {
        super(3); // A triangle always has 3 sides
        this.height = 0; // Default height
        this.breadth = 0; // Default breadth
    }

    public Triangle(int height, int breadth) {
        super(3); // A triangle has 3 sides
        this.height = height;
        this.breadth = breadth;
    }

    // Getter for height
    public int getHeight() { 
        return height;
    }

    // Setter for height
    public void setHeight(int height) {
        this.height = height;
    }

    // Getter for breadth
    public int getBreadth() { 
        return breadth;
    }

    // Setter for breadth
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    // Corrected getArea method
    @Override
    public double getArea() {
        return 0.5 * height * breadth;
    }

    @Override
    public String toString() {
        return "Triangle: \n" +
                "Breadth: " + getBreadth() + "\n" +
                "Height : " + getHeight() + "\n" +
                "Area : " + getArea() + "\n" +
                "No. of sides : " + super.getSides() + "\n";
    }
}
