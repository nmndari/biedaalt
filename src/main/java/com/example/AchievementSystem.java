package com.example;

import java.util.List;

public class AchievementSystem {
    public void checkAchievements(List<Card> cards) {
        boolean allCorrect = true;
        boolean repeat = false;
        boolean confident = false;

        for (Card card : cards) {
            if (!card.isAnsweredCorrectly()) {
                allCorrect = false;
            }
            if (card.getAnswerCount() > 5) {
                repeat = true;
            }
            if (card.getCorrectCount() >= 3) {
                confident = true;
            }
        }

        if (allCorrect) {
            System.out.println("Achievement Unlocked: CORRECT");
        }
        if (repeat) {
            System.out.println("Achievement Unlocked: REPEAT");
        }
        if (confident) {
            System.out.println("Achievement Unlocked: CONFIDENT");
        }
    }
}


