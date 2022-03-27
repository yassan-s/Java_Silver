package free_check.LocalDatetime_conversion;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		// 日時を設定
		LocalDateTime localDateTime = LocalDateTime.of(2019, 04, 01, 23, 59, 58);
		// 文字列に変換
	    String strDate = localDateTime.format(
	    		DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss"));

		// 現在日時を取得
		LocalDateTime nowTime = LocalDateTime.now();

		// DateTimeFormatterクラスのクラスメソッドであるofPattern()メソッドに
		// 書式を文字列として指定し、オブジェクトを作成する
        DateTimeFormatter dtf =
        		DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        // format()メソッドに現在の日時オブジェクト指定し、
        // 書式にあった文字列を取得する
	    String nowTimeStr = dtf.format(nowTime);

	    System.out.println(strDate);
	    System.out.println(nowTimeStr);
	}

}
