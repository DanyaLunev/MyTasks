
import com.tasks.math.SquareRoot;
import com.tasks.view.Print;
import static com.tasks.math.SumOfSquares.sumOfSquares;


class Main {
    public static void main(String[] args) {
        SquareRoot squareRoot = new SquareRoot();
        int[] inputs = {1, 7, 4, 3, 6, 5, 2, 8};
        //printNumber(cubrt(23));
        //printNumber(squareRoot.sqrt(25));
        Print.printNumber(sumOfSquares(inputs));
    }
}
