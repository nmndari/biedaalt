package com.example;

public class Card {
    private boolean answeredCorrectly;
    private int answerCount;
    private int correctCount;

    // Constructor
    public Card() {
        this.answeredCorrectly = false;
        this.answerCount = 0;
        this.correctCount = 0;
    }

    // Getters and Setters
    public boolean isAnsweredCorrectly() {
        return answeredCorrectly;
    }

    public void setAnsweredCorrectly(boolean answeredCorrectly) {
        this.answeredCorrectly = answeredCorrectly;
    }

    public int getAnswerCount() {
        return answerCount;
    }

    public void incrementAnswerCount() {
        this.answerCount++;
    }

    public int getCorrectCount() {
        return correctCount;
    }

    public void incrementCorrectCount() {
        if (answeredCorrectly) {
            this.correctCount++;
        }
    }

    public boolean isMistaken() {
        return !answeredCorrectly;
    }
}
