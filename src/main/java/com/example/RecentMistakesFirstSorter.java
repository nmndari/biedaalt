package com.example;

import java.util.List;

class RecentMistakesFirstSorter implements CardOrganizer {

   @Override
   public List<Card> sortCards(List<Card> var1) {
      var1.sort((var0, var1x) -> {
         return Integer.compare(var1x.getMistakes(), var0.getMistakes());
      });
      return var1;
   }
}


