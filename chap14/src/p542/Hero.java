package p542;

public class Hero {
	String name;
	int hp;
	static int money;
//	static int money = 10000;
	
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public static void setRandomMoney() {
		Hero.money = (int) (Math.random() * 1000);
	}
}
