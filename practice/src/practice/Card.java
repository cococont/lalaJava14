package practice;

import java.util.ArrayList;

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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Card))
			return false;
		Card other = (Card) obj;
		if (number != other.number)
			return false;
		if (suit == null) {
			if (other.suit != null)
				return false;
		} else if (!suit.equals(other.suit))
			return false;
		return true;
	}
}
