# Deck_Operations

A menu-driven Java program to manage a standard deck of 52 playing cards. The program uses an `ArrayList` to store cards and provides various operations to manipulate and interact with the deck. Each card has a rank (2-10, J, Q, K, A) and a suit (Hearts, Clubs, Diamonds, Spades).

## Features
- **Create Deck**: Initializes a new deck of 52 cards.
- **Print Deck**: Displays all cards in the current deck.
- **Print Single Card**: Shows a randomly selected card.
- **Find Cards with Same Suit**: Lists all cards of a specified suit.
- **Compare Cards**: Compares the ranks of two random cards.
- **Find Specific Card**: Searches for a card by rank and suit.
- **Deal 5 Cards**: Distributes 5 random cards from a shuffled deck.
- **Shuffle Deck**: Randomizes the order of cards in the deck.

## Project Structure
- **`Main.java`**: Contains the menu-driven interface and program entry point.
- **`Card.java`**: Defines the `Card` class with rank and suit attributes.
- **`Deck.java`**: Implements the deck operations using an `ArrayList<Card>`.

## Prerequisites
- Java Development Kit (JDK) 8 or higher installed.
- A terminal or IDE (e.g., IntelliJ IDEA, Eclipse) to compile and run the program.

## How to Run
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/rajatwhosebrowsing/Deck_Operations.git
   cd Deck_Operations
