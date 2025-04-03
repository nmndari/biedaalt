package com.example;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;
class FlashcardTest {
    

    @Test
    void testIncrementMistakes() {
        Card card = new Card("What is Java?", "A programming language", 2);
        card.incrementMistakes();
        assertEquals(3, card.getMistakes());
    }

    @Test
    void testRecentMistakesFirstSorter() {
        List<Card> cards = Arrays.asList(
            new Card("Q1", "A1", 1),
            new Card("Q2", "A2", 5),
            new Card("Q3", "A3", 3)
        );

        RecentMistakesFirstSorter sorter = new RecentMistakesFirstSorter();
        List<Card> sortedCards = sorter.sortCards(cards);

        assertEquals("Q2", sortedCards.get(0).getQuestion()); // Highest mistakes first
        assertEquals("Q3", sortedCards.get(1).getQuestion());
        assertEquals("Q1", sortedCards.get(2).getQuestion());
    }

}