// Deck.java
import java.util.*;

public class Deck {
    private ArrayList<Card> deck;
    
    // Constructor that creates the deck
    public Deck() {
        deck = new ArrayList<>();
        createDeck();
    }
    
    // a) Creates a deck of 52 cards
    public void createDeck() {
        deck.clear(); // Clear existing deck
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
        
        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(new Card(rank, suit));
            }
        }
    }
    
    // b) Prints the entire deck
    public void printDeck() {
        if (deck.isEmpty()) {
            System.out.println("Deck is empty!");
            return;
        }
        System.out.println("Current deck (" + deck.size() + " cards):");
        for (Card card : deck) {
            System.out.println(card);
        }
    }
    
    // c) Prints a random card
    public void printCard() {
        if (deck.isEmpty()) {
            System.out.println("Deck is empty!");
            return;
        }
        Random rand = new Random();
        int index = rand.nextInt(deck.size());
        System.out.println("Random card: " + deck.get(index));
    }
    
    // d) Finds cards with same suit
    public void sameCard(String suit) {
        if (deck.isEmpty()) {
            System.out.println("Deck is empty!");
            return;
        }
        System.out.println("Cards with suit " + suit + ":");
        boolean found = false;
        for (Card card : deck) {
            if (card.getSuit().equalsIgnoreCase(suit)) {
                System.out.println(card);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cards found with suit " + suit);
        }
    }
    
    // e) Compares cards by rank
    public void compareCard() {
        if (deck.size() < 2) {
            System.out.println("Not enough cards in deck!");
            return;
        }
        shuffleDeck();
        Card card1 = deck.get(0);
        Card card2 = deck.get(1);
        System.out.println("Comparing two random cards:");
        System.out.println("Card 1: " + card1);
        System.out.println("Card 2: " + card2);
        if (card1.getRank().equals(card2.getRank())) {
            System.out.println("Cards have the same rank!");
        } else {
            System.out.println("Cards have different ranks.");
        }
    }
    
    // f) Finds a specific card
    public void findCard() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rank to find (2-10, J, Q, K, A): ");
        String rank = sc.next();
        System.out.print("Enter suit to find (Hearts/Clubs/Diamonds/Spades): ");
        String suit = sc.next();
        
        boolean found = false;
        for (int i = 0; i < deck.size(); i++) {
            Card card = deck.get(i);
            if (card.getRank().equals(rank) && card.getSuit().equalsIgnoreCase(suit)) {
                System.out.println("Card found at position " + (i + 1) + ": " + card);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Card " + rank + " of " + suit + " not found in deck!");
        }
    }
    
    // g) Deals 5 random cards
    public void dealCard() {
        if (deck.size() < 5) {
            System.out.println("Not enough cards in deck!");
            return;
        }
        shuffleDeck();
        System.out.println("Dealing 5 cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Card " + (i + 1) + ": " + deck.get(i));
        }
    }
    
    // h) Shuffles the deck
    public void shuffleDeck() {
        if (deck.isEmpty()) {
            System.out.println("Deck is empty!");
            return;
        }
        Collections.shuffle(deck);
    }
}