package main.after;

public class Hero {
	private static Hero instance = new Hero();
	String name;
	
//	newできない
	private Hero() {}
	
	public static Hero getInstance() {
		return instance;
	}
}