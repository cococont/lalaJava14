package game.set;

import java.util.ArrayList;
import java.util.Objects;

public class Card {
	private String suit;
	private int number;
	
	public Card() {}
	
	public Card(String suit, int number) {
		this.suit = suit;
		this.number = number;
	}
	
	public String getSuit() {
		return suit;
	}
	public int getNumber() {
		return number;
	}
	@Override
	public String toString() {
		return "[" +suit + ":" + number + "]";
	}
	
	public void setupCards() {
		ArrayList<String> suits = new ArrayList<>();
		suits.add("hrart");
		suits.add("diamond");
		suits.add("spade");
		suits.add("club");
		
		for (String s : suits) {
			for (int i = 1; i <= 13; i++) {
				
			}
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, suit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Card))
			return false;
		Card other = (Card) obj;
		return number == other.number && Objects.equals(suit, other.suit);
	}
}
