package chapter2_data_string.Q10;

public class Main {

	public static void main(String[] args) {
		String str = "hoge, world";
		changeNg(str);
		// hoge, world
		System.out.println(str);

		String str2 = "hoge, world";
		// エラー
		// str2 = changeOk(str2);
		str2 = str2.replaceAll("hoge", "hello");
		//hello, world
		System.out.println(str2);
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
