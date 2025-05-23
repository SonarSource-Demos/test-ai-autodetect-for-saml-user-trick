package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContinentalGame {

    public static boolean isSet(List<String> cards) {
        if (cards.size() < 3) return false;
        String rank = cards.get(0).substring(0, cards.get(0).length() - 1);
        for (String card : cards) {
            if (!card.startsWith(rank)) return false;
        }
        return true;
    }

    public static boolean isRun(List<String> cards) {
        if (cards.size() < 3) return false;
        List<Integer> values = new ArrayList<>();
        for (String card : cards) {
            values.add(cardValue(card));
        }
        Collections.sort(values);
        for (int i = 1; i < values.size(); i++) {
            if (values.get(i) != values.get(i - 1) + 1) return false;
        }
        return true;
    }

    public static int calculateScore(List<String> cards) {
        int score = 0;
        for (String card : cards) {
            score += cardValue(card);
        }
        return score;
    }

    private static int cardValue(String card) {
        String rank = card.substring(0, card.length() - 1);
        switch (rank) {
            case "A": return 15; // Ace is worth 15 points
            case "J": return 10; // Face cards are worth 10 points
            case "Q": return 10;
            case "K": return 10;
            default: return Integer.parseInt(rank); // Number cards are worth their face value
        }
    }
}