package collection.p639;

import java.util.ArrayList;
import java.util.List;

class Hero {
	public String name;
}

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "みなと";
		List<Hero> list = new ArrayList<>();
		list.add(h);
		System.out.println(list.get(0).name);
		h.name = "すがわら";
		System.out.println(list.get(0).name);
	}

}
