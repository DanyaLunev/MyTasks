package com.tasks.math;

import static com.tasks.math.MaxNumbers.maxNumbers;
import static com.tasks.math.PowSum.powSum;

public class SumOfSquares {
    public static int sumOfSquares(int arr[]){
        int[] inputs = arr;
        int[] maximums = new int[2];

        maximums = maxNumbers(inputs);
        int powSumma = powSum(maximums[0], maximums[1]);

        return (int) powSumma;
    }

    public static double sumOfSquares(double arr[]){
        double[] inputs = arr;
        double[] maximums = new double[2];

        maximums = maxNumbers(inputs);
        double powSumma = powSum(maximums[0], maximums[1]);

        return (double) powSumma;
    }
}
