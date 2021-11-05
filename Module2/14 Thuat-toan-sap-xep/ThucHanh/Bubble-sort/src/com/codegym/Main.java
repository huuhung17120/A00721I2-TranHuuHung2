package com.codegym;

import static com.codegym.BubbleSort.bubbleSort;

public class Main {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
