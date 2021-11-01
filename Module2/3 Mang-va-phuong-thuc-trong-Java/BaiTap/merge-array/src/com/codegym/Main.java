package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Nhập độ dài của mảng thứ nhất: ");
        n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        inputArray(arr1, n1);
        System.out.print("Các phần tử của mảng thứ nhất: ");
        showArray(arr1);

        System.out.print("Nhập độ dài của mảng thứ hai: ");
        n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        inputArray(arr2, n2);
        System.out.print("Các phần tử của mảng thứ hai: ");
        showArray(arr2);

        int[] arr3 = null;
        arr3 = merge(arr1, arr2);
        System.out.print("Các phần tử của mảng được gộp: ");
        showArray(arr3);
    }

    public static void inputArray(int arr[], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

    }

    public static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static int[] merge(int[] a, int[] b) {
        int aIndex = a.length - 1;
        int bIndex = b.length - 1;
        int cIndex = a.length + b.length - 1;
        int[] c = new int[cIndex + 1];
        for (int i = cIndex; i > -1; i--) {
            if (aIndex > -1 && bIndex > -1) {
                if (a[aIndex] > b[bIndex]) {
                    c[i] = a[aIndex--];
                } else {
                    c[i] = b[bIndex--];
                }
            } else if (bIndex == -1) {
                c[i] = a[aIndex--];
            } else if (aIndex == -1) {
                c[i] = b[bIndex--];
            }
        }
        return c;
    }
}
