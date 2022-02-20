package chapter9_API.Q16;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// 2つの配列を辞書順に並べたときの並べ順を比較する
		String[]a = {"A", "B"};
		String[]b = {"A", "B"};
		String[]c = {"B", "A"};
		String[]d = {"A"};

		// 全く同じ
		System.out.println(Arrays.compare(a, b)); // 0
		// 第１引数が先
		System.out.println(Arrays.compare(a, c)); // -1
		// 第2引数が先
		System.out.println(Arrays.compare(c, a)); // 1
		// 要素数が異なる場合
		System.out.println(Arrays.compare(a, d)); // 1
		System.out.println(Arrays.compare(d, a)); // -1
	}
}
