package chapter9_API.Q09;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add(2, "B");
		// list.add(1, "B");
		list.add("C");
		list.add("D");
		for (String str: list) {
			System.out.println(str); // 例外がスローされる
		}
	}
}
// まだ１番目の値がない状態で、２番目の"B"を追加しようとしている
// 文法的には問題ないが、例外がスローされる
// list.add(1, "B"); ならABCDと問題なく表示される