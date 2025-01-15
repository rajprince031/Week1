import java.util.*;

public class Cards {

    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int numCards, int numPlayers) {
        if (numCards % numPlayers != 0) {
            System.out.println("Cards cannot be evenly distributed to players.");
            return null;
        }
        
        String[][] playersCards = new String[numPlayers][numCards / numPlayers];
        int cardIndex = 0;

        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < numCards / numPlayers; j++) {
                playersCards[i][j] = deck[cardIndex++];
            }
        }
        return playersCards;
    }

    public static void printPlayersCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.print("Player " + (i + 1) + " cards: ");
            for (int j = 0; j < playersCards[i].length; j++) {
                System.out.print(playersCards[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);

        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        
        System.out.print("Enter the number of cards each player should get: ");
        int numCardsPerPlayer = scanner.nextInt();
        
        int totalCards = numPlayers * numCardsPerPlayer;
        
        if (totalCards > deck.length) {
            System.out.println("Not enough cards in the deck.");
            return;
        }

        String[][] playersCards = distributeCards(deck, totalCards, numPlayers);

        if (playersCards != null) {
            printPlayersCards(playersCards);
        }

        scanner.close();
    }
}
