package Problem2;

// Created Demo class.
public class Demo {
    public static void main(String[] args) {
        Point point = new Point(1.5f, 3.0f);
        System.out.println("Point: " + point);

        point.setXY(4.5f, 5.0f);
        System.out.println("Updated Point: " + point);

        MovablePoint movablePoint = new MovablePoint(1.0f, 2.5f, 0.5f, 0.5f);
        System.out.println("MovablePoint (after move): " + movablePoint);

        movablePoint.setSpeed(1.0f, 1.0f);
        movablePoint.move();
        System.out.println("MovablePoint (after speed update and move): " + movablePoint);
    }
    
}
