package chapter9_API.Q12;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		for(String str : list) {
			if ("B".equals(str)) {
				list.remove(str);
			} else {
				System.out.println(str);
			}
		}
	}
}
// 結果
// A
// 1. "B"がremoveメソッドにより削除された後に、
// 2. 3つ目の"C"が2つ目に移動する
// 3. 次のループ処理に移行しようとする
// 4. 3つ目の"C"は既に移動しており、３つ目の要素はないのでループ処理が終了する

