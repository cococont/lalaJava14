package game.set;

import java.util.HashSet;
//import java.util.Random;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Card> cards = new HashSet<>();
		setupCards(cards);
//		Collections.shuffle(cards);
		Player user = new Player("user");
		user.draw(cards);
		Player com = new Player("com");
		com.draw(cards);
		System.out.println(user.getName() + ":" + user.getCard());
		System.out.println(com.getName() + ":" + com.getCard());
		System.out.println("勝負しますか？ y/n/m:もう一枚");
//		Card card = draw(cards);
		
//		Card card = drawB(cards);
//		System.out.println(card);
		System.out.println(cards.size());
	}
	
	public static void setupCards(Set<Card> cards) {
		
//		String[] suits = {"hrart", "diamond", "spade", "club"};
		
		for (String s : Const.SUITS) {
			for (int i = 1; i <= 13; i++) {
				Card c = new Card(s, i);
				cards.add(c);
			}
		}
//		for (Card c : cards) {
//			System.out.println(c);
//		}
	}
	
//	public static Card drawB(List<Card> cards) {
////		1枚のカードを決める
//		String[] suits = {"hrart", "diamond", "spade", "club"};
//		
//		int a = new Random().nextInt(4);
//		int num =  new Random().nextInt(13) + 1;
//		String suit = suits[a];
//		Card card = new Card(suit, num);
////		Card card = new Card("spade", 13);
////		カードをremove();
//		if (cards.remove(card)) {
//			return card;
//		}
//		return null;
//		
//	}

}
