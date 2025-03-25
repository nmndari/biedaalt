package com.example;

public class FlashcardApp {
    public static void main(String[] args) {
        if (args.length == 0 || args[0].equals("--help")) {
            // Тусламжийн мэдээлэл
            System.out.println("Usage: flashcard <cards-file> [options]");
            System.out.println("--help: Тусламжийн мэдээлэл харуулах");
            System.out.println("--order <order>: Зохион байгуулалтын төрөл (random, worst-first, recent-mistakes-first)");
            System.out.println("--repetitions <num>: Нэг картыг хэдэн удаа хариулах");
            System.out.println("--invertCards: Картын асуулт, хариулт солигдоно");
            return;
        }

        // Үндсэн параметрүүдийг боловсруулах
        String cardsFile = args[0];
        String order = "random";  // default
        int repetitions = 1;  // default
        boolean invertCards = false;  // default

        for (int i = 1; i < args.length; i++) {
            switch (args[i]) {
                case "--order":
                    order = args[++i];  // Дараагийн аргумент
                    break;
                case "--repetitions":
                    repetitions = Integer.parseInt(args[++i]);  // Давтамж
                    break;
                case "--invertCards":
                    invertCards = true;  // Тохиргоо идэвхжүүлэх
                    break;
            }
        }
        
        System.out.println("Cards file: " + cardsFile);
        System.out.println("Order: " + order);
        System.out.println("Repetitions: " + repetitions);
        System.out.println("Invert Cards: " + invertCards);
    }
}

