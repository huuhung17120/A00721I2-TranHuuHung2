package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.print("NHập giá trị của phần tử cần thêm: ");
        int x = scanner.nextInt();
        System.out.print("NHập vị trí của phần tử cần thêm: ");
        int pos = scanner.nextInt();
        addElement(arr, x, pos);
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }

    public static void addElement(int[] arr, int x, int pos) {
        if (pos > arr.length || pos < 0) {
            System.out.print("Không chèn được phần tử vào mảng");
        }
        for (int i = arr.length - 1; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = x;
    }
}
