package com.codegym;

public class Circle {
    public String color = "red";
    public double radius;
    public boolean filled = true;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, boolean filled, String color) {
        this.color = this.color;
        this.radius = this.radius;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
