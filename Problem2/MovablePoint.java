package Problem2;

// Created MovablePoint class.
public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    // Created constructor with no arguments.
    public MovablePoint() {
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    // Created constructor with parameters.
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Created getter and setter methods for xSpeed and ySpeed.
    public float getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Created getter and setter methods for both x and y speed as an array.
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Created method to move x and y points by speed.
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    // Created toString method.
    @Override
    public String toString() {
        return super.toString() + ", Speed = (" + xSpeed + ", " + ySpeed + ")";
    }
    
}
