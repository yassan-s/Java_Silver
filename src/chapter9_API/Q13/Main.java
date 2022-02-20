package chapter9_API.Q13;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		for(String str : list) {
			if ("C".equals(str)) {
				list.remove(str);
			}
		}
		for(String str : list) {
			System.out.println(str); // 例外がスローされる
		}
	}
}
// removeメソッドで要素が移動した後に、繰り返し処理を読み出すと例外がスローする
//