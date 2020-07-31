package com.tasks.math;

public class CubicRoot {
    static double start = 1;
    static double cubrt = 0;
    static int delta = 10;

    public static double cubrt(double number) {
        for (int i = 0; i < delta; i++) {
            cubrt = (number / Math.pow(start, 2) + 2 * start) / 3;
            start = (number / Math.pow(start, 2) + 2 * start) / 3;
        }

        return cubrt;
    }
}