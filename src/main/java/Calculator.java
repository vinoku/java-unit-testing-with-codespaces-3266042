import java.util.Arrays;

public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    // This method should return the result of subtracting y from x.
    public int subtract(int x, int y) {
        return x - y;
    }

    // This method should return the result of multiplying x and y.
    public int multiply(int x, int y) {
        return x * y;
    }

    // This method should return the result of diving x by y.
    public int divide(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("y must be greater than zero");
        }
        return x / y;
    }


    public boolean isEven(int i) {
        return i % 2 == 0;
    }

    public int[] incrementArray(int[] ints) {
        return Arrays.stream(ints).map(i -> i + 1).toArray();
    }
}
