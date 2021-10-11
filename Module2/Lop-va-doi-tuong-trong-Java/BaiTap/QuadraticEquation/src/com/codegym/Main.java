package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        QuadraticEquation qe = new QuadraticEquation();
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.print("Enter a, b, c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        qe.setA(a);
        qe.setB(b);
        qe.setC(c);
        if (qe.getDiscriminant() > 0) {
            System.out.print("The equation has two roots " + qe.getRoot1() + " and " + qe.getRoot2());
        } else if (qe.getDiscriminant() == 0) {
            System.out.print("The equation has one root " + qe.getRoot1());
        }
        else System.out.print("The equation has no real roots ");
    }
}
