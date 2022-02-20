package chapter9_API.Q17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// String配列からコレクションを作成後、ArrayListを作成
		List<String> list = new ArrayList<>(
				Arrays.asList(new String[] {"A", "B", "C"})
		);
		list.removeIf(
				(String s) -> {
					return s.equals("B");
				}
		);
		System.out.println(list); // [A, C]
	}
}
// 引数で渡されたラムダ式がtrueの場合、
// コレクション内の要素を削除する