package com.codegym;

public class Main {

    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        double sum1 = 0.0;

        for (int i = 1; i <= 4; i++) {
            sum1 += Math.sqrt(i);
        }
        stopwatch.stop();

        System.out.print("time: " + stopwatch.getElapsedTime());
    }
}
