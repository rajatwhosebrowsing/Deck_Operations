// Main.java
/*
 * Name: [Your Name]
 * PRN: [Your PRN]
 * Batch: [Your Batch]
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n=== Card Deck Menu ===");
            System.out.println("1. Create Deck");
            System.out.println("2. Print Deck");
            System.out.println("3. Print Single Card");
            System.out.println("4. Find Cards with Same Suit");
            System.out.println("5. Compare Cards");
            System.out.println("6. Find Specific Card");
            System.out.println("7. Deal 5 Cards");
            System.out.println("8. Shuffle Deck");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    deck.createDeck();
                    System.out.println("Deck created successfully!");
                    break;
                case 2:
                    deck.printDeck();
                    break;
                case 3:
                    deck.printCard();
                    break;
                case 4:
                    System.out.print("Enter suit to find (Hearts/Clubs/Diamonds/Spades): ");
                    String suit = sc.next();
                    deck.sameCard(suit);
                    break;
                case 5:
                    deck.compareCard();
                    break;
                case 6:
                    deck.findCard();
                    break;
                case 7:
                    deck.dealCard();
                    break;
                case 8:
                    deck.shuffleDeck();
                    System.out.println("Deck shuffled successfully!");
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);
        
        sc.close();
    }
}