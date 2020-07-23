
class CubicRoot {

    public static void printNumber(double number) {
        System.out.print(number);
    }

    public static double cubrt(double number) {
        double start = 2;
        double cubrt = 0;
        int delta = 10;

        for (int i = 0; i < delta; i++) {
            cubrt = (number / start + 2 * start) / 3;
            start = (number / start + 2 * start) / 3;
        }
        return cubrt;
    }

    public static void main(String[] args) {
        printNumber(cubrt(81.0));
    }
}