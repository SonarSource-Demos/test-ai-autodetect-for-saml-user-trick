package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void testZero() {
        assertEquals(0, Fibonacci.get(0));
    }

    @Test
    void testOne() {
        assertEquals(1, Fibonacci.get(1));
    }

    @Test
    void testSmallNumbers() {
        assertEquals(1, Fibonacci.get(2));
        assertEquals(2, Fibonacci.get(3));
        assertEquals(3, Fibonacci.get(4));
        assertEquals(5, Fibonacci.get(5));
        assertEquals(8, Fibonacci.get(6));
    }

    @Test
    void testLargerNumber() {
        assertEquals(55, Fibonacci.get(10));
        assertEquals(6765, Fibonacci.get(20));
    }

    @Test
    void testNegative() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.get(-1));
    }
}