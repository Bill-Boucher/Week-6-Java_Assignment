
public class App {

	public static void main(String[] args) {

		// Initiate new deck and players with shuffle
		Deck deck = new Deck();
		Player player1 = new Player("Billy");
		Player player2 = new Player("Bob");
		deck.shuffle();

		// For loop for draw method on 52 card deck
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		// For loop to iterate 26 times and flip method
		for (int k = 0; k < 26; k++) {
			int Billy = player1.flip().getRank();
			int Bob = player2.flip().getRank();
			if (Billy > Bob) {
				player1.incrementScore();
				System.out.println("Billy wins the flip");
			} else if (Billy < Bob) {
				player2.incrementScore();
				System.out.println("Bob wins the flip");
			} else {
				System.out.println("DRAW on flip");
			}

		}
		// Winner of game
		System.out.println("Billy's score = " + player1.getScore());
		System.out.println("Bob's score = " + player2.getScore());
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Billy is the Winner");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("Bob is the Winner");
		} else {
			System.out.println("We have a DRAW");
		}

	}

}
