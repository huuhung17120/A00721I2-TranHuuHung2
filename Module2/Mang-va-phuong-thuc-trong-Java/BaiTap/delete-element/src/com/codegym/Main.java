package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.print("NHập giá trị của phần tử cần xóa: ");
        int x = scanner.nextInt();
        int pos =0;
        for (int i = 0; i<arr.length;i++){
            if(arr[i]==x ){
                pos = i;
            }
        }
        deleteElement(arr,pos);
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }

    public static void deleteElement(int[] arr, int pos) {
        for(int i = pos; i < arr.length - 1; i++){
            arr[i] = arr[i+1];
        }
    }
}
