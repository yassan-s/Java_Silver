package chapter2_data_string.Q11_22;

public class Main {

	public static void main(String[] args) {

		//文字番号は0から初まる
		String str = "abcde";

		//charAt
		//引数で指定した位置にある文字を抜き出す
		System.out.println(str.charAt(4)); //e
		//System.out.println(str.charAt(5)); //例外がスローされる

		//indexOF
		//文字列が初まる最初の文字位置が表示される
		System.out.println(str.indexOf("d")); //3
		System.out.println(str.indexOf("bc")); //1 開始位置を表示
		System.out.println(str.indexOf("abcdef")); //-1

		//substring
		//任意の文字列を抽出する
		System.out.println(str.substring(2, 4)); //cd
		System.out.println(str.substring(2)); //cde 開始から最後まで

		//replace
		//第１から第２引数に置換する
		System.out.println(str.replace("a", "b")); //bbcde
		String str2 = "aaaa";
		System.out.println(str2.replace("aa", "b")); //bb 1.baa -> 2.bb

		//length
		//文字数を返す
		System.out.println(str.length()); //5

		//startsWish
		//引数で指定された文字で初まるかを調べる
		System.out.println(str.startsWith("a")); //true

		//concat
		//引数と文字列を連結させる
		String str3 = "hello ".concat("Java");
		System.out.println(str3); //hello Java


		StringBuilder sb = new StringBuilder();
		sb.append("abcde"); //新しい文字列を追加
		sb.reverse(); //反転
		sb.replace(1, 3, "a"); //第1〜第2引数の範囲の文字列を置換する
		System.out.println(sb); // eaba
	}

}
