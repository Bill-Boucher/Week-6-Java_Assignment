
public class Card {

	// Value and name Fields
	private int rank;
	private String name;

	// Public Constructor
	public Card(int newRank, String name) {
		rank = newRank;

		switch (newRank) {
		case 2:
			name = "Two";
			break;
		case 3:
			name = "Three";
			break;
		case 4:
			name = "Four";
			break;
		case 5:
			name = "Five";
			break;
		case 6:
			name = "Six";
			break;
		case 7:
			name = "Seven";
			break;
		case 8:
			name = "Eight";
			break;
		case 9:
			name = "Nine";
			break;
		case 10:
			name = "Ten";
			break;
		case 11:
			name = "Jack";
			break;
		case 12:
			name = "Queen";
			break;
		case 13:
			name = "King";
			break;
		case 14:
			name = "Ace";
			break;

		}

		
	}

	// Method to describe my card
	public String describe() {
		return name + " of " + rank;
	}

	// Getter and Setter Methods

	// Public method to get the card name

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// Public method to get the card value

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}

}
