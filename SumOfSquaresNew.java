

public class SumOfSquaresNew {

    //Print one number
    public static void printNumber(int x) {
        System.out.print(x);
    }

    public static void printNumber(double x) {
        System.out.print(x);
    }


    //Elevates to a power
    public static int pow2(int x) {
        return (int) Math.pow(x, 2);
    }

    public static double pow2(double x) {
        return (double) Math.pow(x, 2);
    }


    //Fold two numbers
    public static int addition(int x, int y) {
        return x + y;
    }

    public static double addition(double x, double y) {
        return x + y;
    }


    //Find two MAX Numbers in array
    public static int[] maxNumbers(int arr[]) {

        int[] result = new int[2];
        int firstMax = arr[0];
        int secondMax = arr[1];

        //Find the largest number
        if (firstMax < secondMax) {
            firstMax = arr[1];
            secondMax = arr[0];
        }

        //System.out.println(firstMax);

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            }
            /*
            if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
            */
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
            /*
            if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
            */
        }

        result[0] = firstMax;
        result[1] = secondMax;

        return result;
    }

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

    public static void main(String[] args) {
        int[] inputs = {1, 7, 4, 3, 6, 5, 2, 8};
        int[] maximums = new int[2];

        maximums = maxNumbers(inputs);
        int powSumma = powSum(maximums[0], maximums[1]);

        //double[] inputs = {1.1, 7.2, 4.3, 3.4, 6.5, 5.6, 2.7, 8.8};
        //double[] maximums = new double[2];

        //maximums = maxNumbers(inputs);
        //double powSumma = powSum(maximums[0], maximums[1]);

        printNumber(powSumma);
    }
}
