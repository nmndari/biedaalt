package com.example;

import java.util.List;

public class RecentMistakesFirstSorter implements CardOrganizer {
    @Override
    public List<Card> organize(List<Card> cards) {
        // Картуудыг сортлох логик
        cards.sort((card1, card2) -> {
            if (card1.isMistaken() && !card2.isMistaken()) {
                return -1;  // Буруу хариулсан карт эхэнд
            } else if (!card1.isMistaken() && card2.isMistaken()) {
                return 1;   // Буруу хариулсан карт эхэнд
            }
            return 0;   // Үл өөрчлөх
        });
        return cards;
    }
}



