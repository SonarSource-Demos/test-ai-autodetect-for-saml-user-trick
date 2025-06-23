package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumesTest {

    @Test
    void testSphere() {
        assertEquals((4.0 / 3.0) * Math.PI * Math.pow(3, 3), Volumes.sphere(3), 0.0001);
        assertEquals(0, Volumes.sphere(0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Volumes.sphere(-2));
    }

    @Test
    void testCylinder() {
        assertEquals(Math.PI * Math.pow(3, 2) * 5, Volumes.cylinder(3, 5), 0.0001);
        assertEquals(0, Volumes.cylinder(0, 5), 0.0001);
        assertEquals(0, Volumes.cylinder(3, 0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Volumes.cylinder(-3, 5));
        assertThrows(IllegalArgumentException.class, () -> Volumes.cylinder(3, -5));
    }

    @Test
    void testCone() {
        assertEquals((1.0 / 3.0) * Math.PI * Math.pow(3, 2) * 5, Volumes.cone(3, 5), 0.0001);
        assertEquals(0, Volumes.cone(0, 5), 0.0001);
        assertEquals(0, Volumes.cone(3, 0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Volumes.cone(-3, 5));
        assertThrows(IllegalArgumentException.class, () -> Volumes.cone(3, -5));
    }

    @Test
    void testRectangularPrism() {
        assertEquals(60, Volumes.rectangularPrism(3, 4, 5), 0.0001);
        assertEquals(0, Volumes.rectangularPrism(0, 4, 5), 0.0001);
        assertEquals(0, Volumes.rectangularPrism(3, 0, 5), 0.0001);
        assertEquals(0, Volumes.rectangularPrism(3, 4, 0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Volumes.rectangularPrism(-3, 4, 5));
        assertThrows(IllegalArgumentException.class, () -> Volumes.rectangularPrism(3, -4, 5));
        assertThrows(IllegalArgumentException.class, () -> Volumes.rectangularPrism(3, 4, -5));
    }

    @Test
    void testToroid() {
        assertEquals(2 * Math.PI * Math.PI * 5 * Math.pow(3, 2), Volumes.toroid(5, 3), 0.0001);
        assertEquals(0, Volumes.toroid(0, 3), 0.0001);
        assertEquals(0, Volumes.toroid(5, 0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Volumes.toroid(-5, 3));
        assertThrows(IllegalArgumentException.class, () -> Volumes.toroid(5, -3));
    }

    @Test
    void testZeppelin() {
        assertEquals((4.0 / 3.0) * Math.PI * (10 / 2.0) * Math.pow(5 / 2.0, 2), Volumes.zeppelin(10, 5), 0.0001);
        assertEquals(0, Volumes.zeppelin(0, 5), 0.0001);
        assertEquals(0, Volumes.zeppelin(10, 0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Volumes.zeppelin(-10, 5));
        assertThrows(IllegalArgumentException.class, () -> Volumes.zeppelin(10, -5));
    }

    @Test
    void testPyramid() {
        assertEquals((1.0 / 3.0) * 3 * 4 * 5, Volumes.pyramid(3, 4, 5), 0.0001);
        assertEquals(0, Volumes.pyramid(0, 4, 5), 0.0001);
        assertEquals(0, Volumes.pyramid(3, 0, 5), 0.0001);
        assertEquals(0, Volumes.pyramid(3, 4, 0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Volumes.pyramid(-3, 4, 5));
        assertThrows(IllegalArgumentException.class, () -> Volumes.pyramid(3, -4, 5));
        assertThrows(IllegalArgumentException.class, () -> Volumes.pyramid(3, 4, -5));
    }

    @Test
    void testCube() {
        assertEquals(Math.pow(3, 3), Volumes.cube(3), 0.0001);
        assertEquals(0, Volumes.cube(0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Volumes.cube(-3));
    }
}