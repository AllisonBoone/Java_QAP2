package Problem3;

// Created Demo class.
public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Ellipse(5, 3);
        shapes[1] = new Circle(4);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new EquilateralTriangle(6);
 
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

    }
    
}
