package free_check.ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		// 抽出したい配列
		ArrayList<String> array1 = new ArrayList<String>();
		array1.add("A");
		array1.add("B");
		array1.add("C");

		// 比較対象の配列
		ArrayList<String> array2 = new ArrayList<String>();
		array2.add("A");
		array2.add("C");
		array2.add("E");

		// array2にある配列の値を除いてarray1の内容を出力する
		ArrayList<String> array3 = new ArrayList<String>();

		for (String str1 : array1) {
			for (String str2 : array2) {
				if (str1.equals(str2)) {
					array3.add(str1);
				} else {
					continue;
				}
			}
		}
		for (int i =0; i < array3.size(); i++) {
			System.out.print(array3.get(i));
		}

	}

}
