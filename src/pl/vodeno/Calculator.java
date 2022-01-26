package pl.vodeno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//Write a *ONE* method in Java that takes 2 numbers and returns the result of the multiplication, division, and the remainder of the division.
//
//Write a unit test to test this method.

public class Calculator {

    private int[] one(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        int[] result = new int[3];
        result[0] = a * b;
        result[1] = a / b;
        result[2] = a % b;
        return result;
    }

    @Test
    public void calcTest() {
        assertArrayEquals(new int[]{20, 5, 0}, one(10, 2));
        assertArrayEquals(new int[]{10, 10, 0}, one(10, 1));
        assertArrayEquals(new int[]{-30, -3, -1}, one(-10, 3));
    }

    @Test
    public void divisionException() {
        assertThrows(IllegalArgumentException.class, () -> one(2, 0));
    }
}