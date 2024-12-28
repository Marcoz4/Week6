package WEEK6HW;

import java.util.ArrayList; // Needed for lists
import java.util.Collections; // Needed to shuffle the list
import java.util.List; // Needed for lists

public class Deck {
    private List<Card> cards; // List of cards in the deck

    // Constructor: Creates a new deck with 52 cards
    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (int i = 0; i < names.length; i++) {
                cards.add(new Card(i + 2, names[i] + " of " + suit)); // Adding new cards to the deck
            }
        }
    }

    // Method to shuffle the deck
    public void shuffle() {
        Collections.shuffle(cards); // Randomizing the order of cards
    }

    // Method to draw a card from the deck
    public Card draw() {
        return cards.remove(0); // Removing and returning the top card
    }
}
