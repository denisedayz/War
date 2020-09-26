
public class Main {

	public static void main(String[] args) {

		Deck deck = new Deck();

		Player player1 = new Player("Player 1");

		Player player2 = new Player("Player 2");

		deck.shuffle();

		for (int i = 1; i <= 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}

		for (int i = 1; i <= 26; i++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();

			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
			} else if (player2Card.getValue() > player1Card.getValue()) {
				player2.incrementScore();
					}
		}

		int player1Score = player1.getScore();
		int player2Score = player2.getScore();
		
		System.out.println("Player 1 Score: " + player1Score);
		System.out.println("Player 2 Score: " + player2Score);

		if (player1Score == player2Score) {
			System.out.println("It's a draw.");
		} else if (player1Score > player2Score) {
			System.out.println("Player 1 wins!");
		} else {
			System.out.println("Player 2 wins!");
		}
	}

}
