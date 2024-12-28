package WEEK6HW;

import java.util.ArrayList; // Needed for lists
import java.util.List; // Needed for lists

public class Player {
    private List<Card> hand; // List of cards in the player's hand
    private int score; // Player's score
    private String name; // Player's name

    // Constructor: Creates a new player with a name
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for score
    public int getScore() {
        return score;
    }

    // Method to describe the player
    public void describe() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            card.describe(); // Print each card in the hand
        }
    }

    // Method to flip a card from the hand
    public Card flip() {
        return hand.remove(0); // Take the top card from the hand
    }

    // Method to draw a card from the deck
    public void draw(Deck deck) {
        hand.add(deck.draw()); // Add a card from the deck to the hand
    }

    // Method to increment the score
    public void incrementScore() {
        score++; // Add 1 to the score
    }
}
