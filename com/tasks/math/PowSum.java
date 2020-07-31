package com.tasks.math;

import static com.tasks.math.Pow2.pow2;
import static com.tasks.math.Addition.addition;

public class PowSum {
    public static int powSum(int x, int y) {
        x = pow2(x);
        y = pow2(y);

        return addition(x, y);
    }

    public static double powSum(double x, double y) {
        x = pow2(x);
        y = pow2(y);

        return addition(x, y);
    }
}
