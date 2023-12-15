package practice;

import java.util.List;
import java.util.Random;

public class Player {
	private String name;
	private Card card;
	
	public Player() {}
	public Player(String name) {
		this.name = name;
	}
	
	public void draw(List<Card> cards) {
		Card card = null;
		int num = new Random().nextInt(cards.size());
		if (cards.size() > 0) {
			this.card = cards.remove(num);
		}
	}
	public String getName() {
		return name;
	}
	public Card getCard() {
		return card;
	}
}
