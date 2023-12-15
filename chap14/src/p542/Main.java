package p542;

public class Main {

	public static void main(String[] args) {
		Hero.setRandomMoney();
		Hero h1 = new Hero("A", 100);
		Hero h2 = new Hero("B", 200);
		
		System.out.println(h1.hp);
		System.out.println(h2.hp);
		System.out.println(Hero.money);
//		h1.money = 3000;
		System.out.println(h2.money);
	}

}
