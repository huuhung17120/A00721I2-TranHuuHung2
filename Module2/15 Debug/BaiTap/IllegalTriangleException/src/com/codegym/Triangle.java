package com.codegym;

import java.util.Scanner;

public class Triangle {

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 < side3)
            throw new IllegalTriangleException("Tam giác không hợp lệ.");
        else if (side1 <0||side2 <0||side3 <0)
            throw new IllegalTriangleException("Tam giác không hợp lệ.");
        else
            System.out.println("Tam giác hợp lệ.");
    }

    public static void main(String args[]) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập các cạnh của tam giác: ");
        System.out.println("Nhập cạnh thứ nhất: ");
        int side1 = scaner.nextInt();
        System.out.println("Nhập cạnh thứ hai: ");
        int side2 = scaner.nextInt();
        System.out.println("Nhập cạnh thứ ba: ");
        int side3 = scaner.nextInt();
        try {
            Triangle obj = new Triangle(side1, side2, side3);
        } catch (Exception m) {
            System.out.println("Exception occured: " + m);
        }
    }
}


