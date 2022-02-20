package chapter9_API.Q19;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// HashMapはnullを許容している
		Map<Integer, Item> map = new HashMap<Integer, Item>();
		map.put(1, new Item(1, "A"));
		map.put(2, new Item(2, "B"));
		map.put(3, new Item(3, "C"));
		map.put(1, new Item(1, "A"));
		map.put(null, new Item(0, "default"));

		System.out.println(map.size()); // 4
	}
}
