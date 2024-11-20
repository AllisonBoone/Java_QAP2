package Problem2;

// Created Point class.
public class Point {
    private float x;
    private float y;

    // Created the constructor with no arguments.
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    // Created constructor with parameters.
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Created getter and setter methods for x and y.
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }

    // Created getter and setter methods for x and y as an array.
    public float[] getXY() {
        return new float[]{x, y};
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Created toString method.
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
