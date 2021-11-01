package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("MỜi bạn nhập số tiền USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * vnd;
        System.out.print("Gia tri vnd: " + quydoi);
    }
}
