package chapter9_API.Q05;

import java.time.LocalDate;

public class Sample {

	public static void main(String[] args) {
		// 日付を指定してインスタンスを作成
		LocalDate a = LocalDate.of(2015, １, 1);
		// 文字列の日付をLocalDateクラスに変換する
		LocalDate b = LocalDate.parse("2015-01-01");
		System.out.println(a.equals(b)); // true
		System.out.println(a); // 2015-01-01
		System.out.println(b); // 2015-01-01
	}
}
