package com.codegym;

public class Cylinder extends Circle {
    public double height;

    public Cylinder() {
    }

    public Cylinder(double radius) {
        this.radius = radius;
    }

    public Cylinder(double radius, String color, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getVolume() {
        return height * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "A Cylinder with radius="
                + getRadius()
                + " color: "
                + getColor()
                + ", Volume: "
                + getVolume();
    }
}
