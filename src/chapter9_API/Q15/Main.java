package chapter9_API.Q15;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// 引数で渡された２つの配列を先頭から順番に比較し、
		// 一致しない要素のインデックスを戻す
		String[]a = {"a", "b", "c"};
		String[]b = {"a", "b", "c"};
		String[]c = {"a", "e", "c"};
		String[]d = {"a", "b"};

		System.out.println(Arrays.mismatch(a, b)); // -1
		System.out.println(Arrays.mismatch(a, c)); // 1
		System.out.println(Arrays.mismatch(a, d)); // 2
	}
}
