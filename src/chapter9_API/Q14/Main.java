package chapter9_API.Q14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// listインタフェースにあるofメソッドにより、
		// 固定長のリストを作成
		var list1 = List.of(1,2,3);

		// IntegerクラスでのArrayListを作成
		var list2 = new ArrayList<Integer>();

		// 配列型インスタンスを作成
		// そこから固定長のリストを作成
		var list3 = Arrays.asList(new Integer[] {1,2,3});
		//list3.add(0); // 例外がスローされる
		list3.set(0, 0);
		for (int i : list3) {
			System.out.println(i); // 0 2 3
		}

		// サイズを指定して初期化する
		var list4 = new ArrayList<Integer>(3);
		list4.add(0);
		list4.add(1);
		list4.add(2);
		list4.add(3);
		for (int i : list4) {
			System.out.println(i); // 0 1 2 3
		}
	}
}
