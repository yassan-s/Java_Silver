package chapter3_operator.Q14;

public class Main {

	public static void main(String[] args) {
		String str1 = new String("def");
		String str2 = new String("def");

		// 1.ヒープ領域にある"def"がStringコンスタントプールにあるか確認
		// 2.なければStringコンスタントプールに追加
		// 3.str2がintern化するときに、
		//   str1がintern化した時に作成されたStringコンスタントプールが戻されるため
		//   同じ参照となる
		// 参考URL https://programmer-life.work/java/interning-java
		System.out.println(str1.intern() == str2.intern()); //true
		System.out.println(str1.intern()); // def
		System.out.println(str2.intern()); // def
	}
}
