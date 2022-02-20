package chapter9_API.Q18;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = List.of("A", "B", "C");

		// ラムダ式
		list.forEach(str -> System.out.println(str));

		// メソッド参照
		list.forEach(System.out::println);
	}

}
