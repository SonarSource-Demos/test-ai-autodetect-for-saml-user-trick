package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class HanoiTowersTest {

    @Test
    void testSolveWithOneDisk() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        HanoiTowers.solve(1, 'A', 'C', 'B');

        assertEquals("Move disk 1 from A to C\n", output.toString());
    }

    @Test
    void testSolveWithTwoDisks() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        HanoiTowers.solve(2, 'A', 'C', 'B');

        String expected = """
                Move disk 1 from A to B
                Move disk 2 from A to C
                Move disk 1 from B to C
                """;
        assertEquals(expected, output.toString());
    }

    @Test
    void testSolveWithThreeDisks() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        HanoiTowers.solve(3, 'A', 'C', 'B');

        String expected = """
                Move disk 1 from A to C
                Move disk 2 from A to B
                Move disk 1 from C to B
                Move disk 3 from A to C
                Move disk 1 from B to A
                Move disk 2 from B to C
                Move disk 1 from A to C
                """;
        assertEquals(expected, output.toString());
    }

    @Test
    void testSolveWithInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> HanoiTowers.solve(0, 'A', 'C', 'B'));
    }
}