package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    int choicest = 0;
                    System.out.println("--- Choose the type of square triangles:");
                    System.out.println("1. Print top-left");
                    System.out.println("2. Print top-right");
                    System.out.println("3. Print bottom-left");
                    System.out.println("4. Print bottom-right");
                    choicest = input.nextInt();
                    switch (choicest) {
                        case 1:
                            for (int i = 7; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println("");
                            }
                            break;

                        case 2:
                            for (int i = 0; i < 7; i++) {
                                for (int j = 0; j < 7; j++) {
                                    if (j < i) {
                                        System.out.print(" ");
                                    } else {
                                        System.out.print("*");
                                    }
                                }
                                System.out.println("");
                            }
                            break;

                        case 3:
                            for (int i = 1; i <= 5; i++) {
                                for (int j = 1; j < i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println("");
                            }
                            break;
                        case 4:
                            for (int i = 0; i < 7; i++) {
                                for (int k = 7 - i; k > 0; k--) {
                                    System.out.print(" ");
                                }
                                for (int j = 0; j < i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println("");
                            }
                            break;

                    }

                case 3:
                    for (int i = 0; i < 7; i++) {
                        for (int k = 0; k <= 7 - i; k++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j <= (i * 2) - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
