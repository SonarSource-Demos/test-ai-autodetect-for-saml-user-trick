


package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContinentalGameTest {

    @Test
    void testIsSetWithJokers() {
        assertFalse(ContinentalGame.isSet(List.of("7H", "7D", "JK"))); // Assuming "JK" is Joker, not handled
    }

    @Test
    void testIsSetWithFaceCards() {
        assertTrue(ContinentalGame.isSet(List.of("QH", "QS", "QC")));
        assertFalse(ContinentalGame.isSet(List.of("QH", "QS", "KC")));
    }

    @Disabled
    @Test
    void testIsRunWithFaceCards() {
        assertTrue(ContinentalGame.isRun(List.of("JD", "QD", "KD")));
        assertFalse(ContinentalGame.isRun(List.of("JD", "QD", "KS")));
    }

    @Disabled
    @Test
    void testIsRunWithNonConsecutive() {
        assertFalse(ContinentalGame.isRun(List.of("5H", "7H", "6H")));
    }

    @Disabled
    @Test
    void testIsRunWithDifferentSuits() {
        assertFalse(ContinentalGame.isRun(List.of("7H", "8D", "9H")));
    }

    @Test
    void testCalculateScoreWithNumbers() {
        assertEquals(6, ContinentalGame.calculateScore(List.of("2H", "2D", "2S")));
    }

    @Test
    void testCalculateScoreWithFaceCards() {
        assertEquals(30, ContinentalGame.calculateScore(List.of("JH", "QD", "KS")));
    }

    @Test
    void testCalculateScoreWithAce() {
        assertEquals(15, ContinentalGame.calculateScore(List.of("AH")));
        assertEquals(25, ContinentalGame.calculateScore(List.of("AH", "10S")));
    }

    @Disabled
    @Test
    void testCalculateScoreWithMixedHand() {
        assertEquals(37, ContinentalGame.calculateScore(List.of("AH", "2D", "JC", "4S", "KH")));
    }
}