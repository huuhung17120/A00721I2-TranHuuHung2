package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số bạn muốn chuyển: ");
        String strones = "", strtens = "", strhundreds = "";
        int num = scanner.nextInt();
        int ones = num % 10;
        int tens = num % 100;
        int hundreds = (num / 100);
        switch (ones) {
            case 1:
                strones = "one";
                break;
            case 2:
                strones = "two";
                break;
            case 3:
                strones = "three";
                break;
            case 4:
                strones = "four";
                break;
            case 5:
                strones = "five";
                break;
            case 6:
                strones = "six";
                break;
            case 7:
                strones = "seven";
                break;
            case 8:
                strones = "eight";
                break;
            case 9:
                strones = "nine";
                break;
        }
        if ((tens >= 10) && (tens < 20)) {
            switch (tens) {
                case 10:
                    strtens = "ten";
                    break;
                case 11:
                    strtens = "eleven ";
                    break;
                case 12:
                    strtens = "twelve ";
                    break;
                case 13:
                    strtens = "thirteen ";
                    break;
                case 14:
                    strtens = "fourteen ";
                    break;
                case 15:
                    strtens = "fifteen ";
                    break;
                case 16:
                    strtens = "sixteen ";
                    break;
                case 17:
                    strtens = "seventeen ";
                    break;
                case 18:
                    strtens = "eighteen ";
                    break;
                case 19:
                    strtens = "nineteen ";
                    break;
            }
        } else {
            switch (tens / 10) {

                case 2:
                    strtens = "twenty ";
                    break;
                case 3:
                    strtens = "thirty ";
                    break;
                case 4:
                    strtens = "forty ";
                    break;
                case 5:
                    strtens = "fifty ";
                    break;
                case 6:
                    strtens = "sixty ";
                    break;
                case 7:
                    strtens = "seventy ";
                    break;
                case 8:
                    strtens = "eighty ";
                    break;
                case 9:
                    strtens = "ninety ";
                    break;
            }

        }
        if (num > 99) {
            switch (hundreds) {
                case 1:
                    strhundreds = "one hundred ";
                    break;
                case 2:
                    strhundreds = "two hundred ";
                    break;
                case 3:
                    strhundreds = "three hundred ";
                    break;
                case 4:
                    strhundreds = "four hundred ";
                    break;
                case 5:
                    strhundreds = "five hundred ";
                    break;
                case 6:
                    strhundreds = "six hundred ";
                    break;
                case 7:
                    strhundreds = "seven hundred ";
                    break;
                case 8:
                    strhundreds = "eight hundred ";
                    break;
                case 9:
                    strhundreds = "nine hundred ";
                    break;
            }
        }
        if (tens >= 10 && tens < 20) {
            System.out.println(strhundreds +  strtens );
        } else
            System.out.println(strhundreds +  strtens +  strones);
    }
}
