package Problem4;

// Created Triangle class. 
public class Triangle extends Shape {
    private double side1, side2, side3;


    // Created the constructor.
    public Triangle(double side1, double side2, double side3) {
        super("Triangle");
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
            throw new IllegalArgumentException("Invalid side lengths for a triangle.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    // Created the Override.
    @Override
    public double getArea() {
        double s = getPerimeter() / 2; 
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void scale(float scaleFactor) {
        side1 *= scaleFactor;
        side2 *= scaleFactor;
        side3 *= scaleFactor;
    }
}

