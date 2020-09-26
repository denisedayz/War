import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

	private static String[] cardSuits = { "Hearts", "Diamonds", "Clubs", "Spades" };

	private static String[] cardNames = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King",
			"Ace" };

	private int[] cardValues = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

	private List<Card> cards = new ArrayList<Card>();

	public Deck() {
		for (String cardSuit : cardSuits) {
			for (int i = 0; i < cardValues.length; i++) {
				String name = cardNames[i] + " of " + cardSuit;
				int value = cardValues[i];
				Card card = new Card(name, value);
				cards.add(card);
			}
		}
	}

	public void shuffle() {

		Random random = new Random();

		for (int i = 0; i < cards.size(); i++) {

		}
		for (int i = cards.size() - 1; i > 0; i--) {
			int k = random.nextInt(i + 1);

			Card cardAtIndexI = cards.get(i);
			Card cardAtIndexK = cards.get(k);

			cards.set(i, cardAtIndexK);
			cards.set(k, cardAtIndexI);

		}
	}

	public Card draw() {
		return cards.remove(0);
	}

	public void displayDeck() {
		for (Card card : cards)
			card.describe();
	}
}
