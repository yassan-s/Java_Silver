package chapter2_data_string.Q10;

public class Main {

	public static void main(String[] args) {
		String str = "hoge, world";
		changeNg(str);
		// hoge, world
		System.out.println(str);

		String str2 = "hoge, world";
		// エラー
		//changeOk(str2);
		str2.replaceAll("hoge", "hello");
		//hello, world
		System.out.println(str2);

		String str3 = "hoge, world";
		str3 = str3.replaceAll("hoge", "hello");
		System.out.println(str3);
	}

	private static void changeNg(String msg) {
		msg.replaceAll("hoge", "hello");
	}

	// staticなメソッドから、同じクラス内の非staticメソッドへの直接のアクセスはできない
	// mainクラスのmainメソッドはstatic, changeOkは非staticであるから
	public String changeOk(String msg) {
		return msg.replaceAll("hoge", "hello");
	}

}
