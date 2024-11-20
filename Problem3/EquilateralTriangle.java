package Problem3;

// Created EquilateralTriangle class.
public class EquilateralTriangle extends Triangle{

    // Created the constructor.
    public EquilateralTriangle(double side) {
        super(side, side, side);
        super.name = "Equilateral Triangle";
    }

    // Created Override.
    public double getArea() {
        double side = getPerimeter() / 3;
        return (Math.sqrt(3) / 4) * side * side;
    }
    
}
