package com.codegym;

public class Circle {
    public double radius = 1.0;
    public String color = "red";
    public boolean filled = false;

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int x = 5 * i;
    }
}

