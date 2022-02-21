package chapter9_API.Q05;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		LocalDate a = LocalDate.of(2015, 0, 1);
		LocalDate b = LocalDate.parse("2015-01-01");
		System.out.println(a.equals(b)); // 例外がスローされる
	}
}
// 文法的には問題ないが、月が0になっている