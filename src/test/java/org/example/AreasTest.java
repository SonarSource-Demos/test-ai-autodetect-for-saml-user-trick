package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreasTest {

    @Test
    void testCircle() {
        assertEquals(Math.PI * 4, Areas.circle(2), 0.0001);
        assertEquals(0, Areas.circle(0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Areas.circle(-1));
    }

    @Test
    void testSquare() {
        assertEquals(16, Areas.square(4), 0.0001);
        assertEquals(0, Areas.square(0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Areas.square(-3));
    }

    @Test
    void testRectangle() {
        assertEquals(20, Areas.rectangle(4, 5), 0.0001);
        assertEquals(0, Areas.rectangle(0, 5), 0.0001);
        assertEquals(0, Areas.rectangle(4, 0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Areas.rectangle(-1, 2));
        assertThrows(IllegalArgumentException.class, () -> Areas.rectangle(2, -1));
    }

    @Test
    void testTriangle() {
        assertEquals(6, Areas.triangle(3, 4), 0.0001);
        assertEquals(0, Areas.triangle(0, 4), 0.0001);
        assertEquals(0, Areas.triangle(3, 0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Areas.triangle(-1, 2));
        assertThrows(IllegalArgumentException.class, () -> Areas.triangle(2, -1));
    }

    @Test
    void testHeptagon() {
        double expected = (7.0 / 4.0) * 3 * 3 * (1 / Math.tan(Math.PI / 7));
        assertEquals(expected, Areas.heptagon(3), 0.0001);
        assertEquals(0, Areas.heptagon(0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Areas.heptagon(-2));
    }

    @Test
    void testPentagon() {
        double expected = (5.0 / 4.0) * 2 * 2 * (1 / Math.tan(Math.PI / 5));
        assertEquals(expected, Areas.pentagon(2), 0.0001);
        assertEquals(0, Areas.pentagon(0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Areas.pentagon(-2));
    }

    @Test
    void testParallelogram() {
        assertEquals(12, Areas.parallelogram(3, 4), 0.0001);
        assertEquals(0, Areas.parallelogram(0, 4), 0.0001);
        assertEquals(0, Areas.parallelogram(3, 0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Areas.parallelogram(-1, 2));
        assertThrows(IllegalArgumentException.class, () -> Areas.parallelogram(2, -1));
    }

    @Disabled
    @Test
    void testTrapezoid() {
        assertEquals(12, Areas.trapezoid(4, 8, 2), 0.0001);
        assertEquals(0, Areas.trapezoid(0, 8, 2), 0.0001);
        assertEquals(0, Areas.trapezoid(4, 0, 2), 0.0001);
        assertEquals(0, Areas.trapezoid(4, 8, 0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Areas.trapezoid(-1, 2, 3));
        assertThrows(IllegalArgumentException.class, () -> Areas.trapezoid(1, -2, 3));
        assertThrows(IllegalArgumentException.class, () -> Areas.trapezoid(1, 2, -3));
    }

    @Test
    void testEllipse() {
        assertEquals(Math.PI * 3 * 2, Areas.ellipse(3, 2), 0.0001);
        assertEquals(0, Areas.ellipse(0, 2), 0.0001);
        assertEquals(0, Areas.ellipse(3, 0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Areas.ellipse(-1, 2));
        assertThrows(IllegalArgumentException.class, () -> Areas.ellipse(1, -2));
    }

    @Test
    void testRhombus() {
        assertEquals(12, Areas.rhombus(6, 4), 0.0001);
        assertEquals(0, Areas.rhombus(0, 4), 0.0001);
        assertEquals(0, Areas.rhombus(6, 0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Areas.rhombus(-1, 2));
        assertThrows(IllegalArgumentException.class, () -> Areas.rhombus(1, -2));
    }
}