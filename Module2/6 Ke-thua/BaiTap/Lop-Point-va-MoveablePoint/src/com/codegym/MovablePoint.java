package com.codegym;

public class MovablePoint extends Point {
    protected float xSpeed = 0.0f;
    protected float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] speed = {this.xSpeed, this.ySpeed};
        return speed;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "), "
                + "speed= (" + getxSpeed() + "," + getySpeed() + ")";

    }

    MovablePoint move() {
        this.x += this.xSpeed;
        this.y += this.ySpeed;
        return this;
    }
}
