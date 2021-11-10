package com.codegym;

import java.util.List;
import java.util.Scanner;

import static com.codegym.ReadAndWriteFile.findMax;

public class Main {

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\A00721I2-TranHuuHung2\\Module2\\16 IO-Text-File\\ThucHanh\\Find-the-maximum-value-an-write-to-file\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("result.txt", maxValue);
    }
}
