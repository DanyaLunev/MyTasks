package com.tasks.math;

public class SquareRoot {
    double start = 8;
    double sqrt = 0;
    int delta = 30;

    public double sqrt(double number) {
        for (int i = 0; i < delta; i++) {
            sqrt = (start + number/start) / 2;
            start = (start + number/start) / 2;
        }

        return sqrt;
    }
}
