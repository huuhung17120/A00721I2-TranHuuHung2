package com.codegym;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation() {

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = 0;
        delta = this.b * this.b - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        double r1 = 0;
        r1 = (-this.b + Math.pow(getDiscriminant(), 0.5)) / 2 * this.a;
        return r1;
    }

    public double getRoot2() {
        double r2 = 0;
        r2 = (-this.b - Math.pow(getDiscriminant(), 0.5)) / 2 * this.a;
        return r2;
    }
}
