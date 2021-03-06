import java.util.ArrayList;
import java.util.List;

public class Player {
//List of card with constructor and name
	 List <Card> hand = new ArrayList<Card>();
	int score=0;
	String name;
	
	public Player (String name) {
		this.name = name;
		
	}
	
	
//Getter and Setters
	public List <Card> getHand() {
		return hand;
	}

	public void setHand(List <Card> hand) {
		this.hand = hand;
	}
//Describe method
	public String describe() {
		StringBuilder playerDescribe = new StringBuilder();
		
		for (Card cards:hand) {
			playerDescribe.append(cards.describe());
			
		}
		return playerDescribe.toString();
	}
//Flip method
	public Card flip () {
		return hand.remove(0);
	}
//Draw method	
	public void draw (Deck deck) {
		hand.add(deck.draw());
	}
//Increment and score method	
	public void incrementScore() {
		score++;
		
	}
//Score method
	public int getScore() {
		return score;
	}
}
