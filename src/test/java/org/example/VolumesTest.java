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
}