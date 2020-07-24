
class CubicRoot {

    public static void printNumber(double number) {
        System.out.print(number);
    }

    public static double cubrt(double number) {
        double start = 1;
        double cubrt = 0;
        int delta = 10;

        for (int i = 0; i < delta; i++) {
            cubrt = (number / Math.pow(start, 2) + 2 * start) / 3;
            start = (number / Math.pow(start, 2) + 2 * start) / 3;
        }
        return cubrt;
    }

    public static void main(String[] args) {
        printNumber(cubrt(23.0));
    }
}