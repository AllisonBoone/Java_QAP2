package Problem4;

// Created Demo class.
public class Demo {
    public static void scaleAll(Scalable[] scalables, float scaleFactor) {
        for (Scalable scalable : scalables) {
            scalable.scale(scaleFactor);
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Ellipse(5, 3);
        shapes[1] = new Circle(4);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new EquilateralTriangle(6);

       // Created outputs.
        System.out.println("Before Scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        scaleAll(shapes, 2);

        System.out.println("\nAfter Scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}

