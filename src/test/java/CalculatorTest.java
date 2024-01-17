import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int expected = 3;

        int actual = calculator.add(1, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubstract() {
        int expected = 3;

        int actual = calculator.subtract(7, 4);

        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 12;

        int actual = calculator.multiply(3, 4);

        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        int expected = 3;

        int actual = calculator.divide(12, 4);

        assertEquals(expected, actual);
    }

    @Test
    public void testIsEven() {
        boolean actual = calculator.isEven(4);

        assertTrue(actual);
    }

    @Test
    public void testIncrementArray() {
        int[] expected = new int[]{ 1+1, 2+1, 3+1 };

        int[] actual = calculator.incrementArray(new int[]{ 1, 2, 3 });

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(4, 0));

        String expectedMessage = "y must be greater than zero";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

}
