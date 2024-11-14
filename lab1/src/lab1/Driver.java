package lab1;

public class Driver {
	public static void main (String[]args)
	{
        // Creating and testing rectangles

		Rectangle rectangle1 = new Rectangle(4, 2);
		Rectangle rectangle2 = new Rectangle (3, 7);
		
		System.out.println("Rectangle 1: Width = " + rectangle1.getWidth() + ", Height = " + rectangle1.getHeight());
		System.out.println("Area of Rectangle 1: " + rectangle1.getArea());

		
		System.out.println("Rectangle 2: Width = " + rectangle2.getWidth() + ", Height = " + rectangle2.getHeight());
		System.out.println("Area of Rectangle 2: " + rectangle2.getArea());
		System.out.println("Number of sides of rectangle: " + rectangle1.getNumOfSides());

		
        // Creating and testing circles

		Circle circle1 = new Circle(20);
		Circle circle2 = new Circle(10);

		
		System.out.println("Radius of a Circle1 = " + circle1.getRadius());
		System.out.println("Area of a circle1: " + circle1.getArea());
		
		System.out.println("Radius of a Circle2 = " + circle2.getRadius());
		System.out.println("Area of a circle2: " + circle2.getArea());
		System.out.println("Number of side of circle: " + circle2.getNumOfSides());

		
		
        // Creating and testing ellipses

		
		Ellipse ellipse = new Ellipse(8, 6);
        System.out.println("Ellipse: Width = " + ellipse.getWidth() + ", Height = " + ellipse.getHeight());
        System.out.println("Area of Ellipse: " + ellipse.getArea());
        System.out.println("Number of side of Ellipse: " + ellipse.getNumOfSides());
        
        //Creating and testing hexagon
	    Hexagon hexagon = new Hexagon(8);
		System.out.println("Area of a hexagon: " + hexagon.getArea());
		System.out.println("Perimeter of a hexagon: " + hexagon.getPerimeter());
        System.out.println("Number of side of hexagon: " + hexagon.getSides());
        
      //creating  and testing square
      		Square square= new Square(5);
    		System.out.println("Area of a square: " + square.getArea());
    		System.out.println("Perimeter of a square: " + square.getPerimeter());
            System.out.println("Number of side of square: " + square.getSides());

       //creating and testing triangle
            Triangle triangle = new Triangle(5, 10); 
            System.out.println("Triangle: Breadth = " + triangle.getBreadth() + 
                               ", Height = " + triangle.getHeight());
            System.out.println("Area of Triangle: " + triangle.getArea());
            System.out.println("Number of sides of Triangle: " + triangle.getSides());
		

		

	    

        
        
    	
        
        

	}
	}


