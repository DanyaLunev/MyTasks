package com.tasks.math;

public class MaxNumbers {
    public static int[] maxNumbers(int arr[]) {

        int[] result = new int[2];
        int firstMax = arr[0];
        int secondMax = arr[1];

        //Find the largest number
        if (firstMax < secondMax) {
            firstMax = arr[1];
            secondMax = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            }
        }

        result[0] = firstMax;
        result[1] = secondMax;

        return result;
    }

    public static double[] maxNumbers(double arr[]) {

        double[] result = new double[2];
        double firstMax = arr[0];
        double secondMax = arr[1];

        //Find the largest number
        if (firstMax < secondMax) {
            firstMax = arr[1];
            secondMax = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            }
        }

        result[0] = firstMax;
        result[1] = secondMax;

        return result;
    }
}
