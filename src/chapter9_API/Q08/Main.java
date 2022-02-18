package chapter9_API.Q08;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("A");
		list.add(10);
		list.add('B');
		for (Object obj: list) {
			System.out.println(obj); // A 10 B
		}
	}
}
// コレクションAPIは、オブジェクトであればどのような型でも扱える
