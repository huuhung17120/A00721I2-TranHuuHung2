package com.codegym;

public class Main {

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3.5);
        System.out.println(cylinder);

        cylinder = new Cylinder(3.5, "indigo", 10);
        System.out.println(cylinder);
    }
}
