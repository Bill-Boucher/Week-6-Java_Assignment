import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
//Lists of cards	
	List<Card> cards= new ArrayList<Card>();
	List<String> suits = Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades");

//public Constructor
	public Deck() {
		for (int i = 2; i <=15; i++) {
			
			for (String suit : suits) {
				cards.add(new Card(i, suit));

			}
		}
	}

//Shuffle method
	public void shuffle() {
		Collections.shuffle(cards);
	}

//Draw method
	public Card draw() {
		return cards.remove(0);
	}

}
