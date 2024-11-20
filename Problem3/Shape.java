package Problem3;

// Created Shape class.
public abstract class Shape {
    protected String name;

    // Created the constructor.
    public Shape(String name) {
        this.name = name;
    }

    // Created abstract methods.
    public abstract double getArea();
    public abstract double getPerimeter();

    // Created toString method.
    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
