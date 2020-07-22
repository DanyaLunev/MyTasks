
class SquareRoot {

    public static void printNumber(double number) {
        System.out.print(number);
    }

    public static double sqrt(double number) {
        double start = 8;
        double sqrt = 0;
        int delta = 30;

        for (int i = 0; i < delta; i++) {
            sqrt = (start + number/start) / 2;
            start = (start + number/start) / 2;
        }
        return sqrt;
    }

    public static void main(String[] args) {
        printNumber(sqrt(81.0));
    }
}

