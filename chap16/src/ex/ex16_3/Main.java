package ex.ex16_3;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("suzuki");
		Hero h2 = new Hero("saito");
		Map<Hero, Integer> hMap = new HashMap<>();
		hMap.put(h1, 3);
		hMap.put(h2, 7);
		for (Map.Entry<Hero, Integer> entry : hMap.entrySet()) {
			System.out.println(entry.getKey().getName() + "が倒した敵: " + entry.getValue());
		}
		for (Hero key : hMap.keySet()) {
			int value = hMap.get(key);
			System.out.println(key.getName() + "が倒した敵:" + value);
		}
	}

}
