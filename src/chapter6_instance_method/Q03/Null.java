package chapter6_instance_method.Q03;

public class Null {

	public static void main(String[] args) {
		// 参照を保持していない
		Object obj1 = null;
		System.out.println(obj1);

		// 参照型とプリミティブ型で互換性はない
		Object obj2 = false;
		System.out.println(obj2);

//コンパイルエラー nullではないことを注意
//		Object obj3 = NULL;
//		System.out.println(obj3);

		// 文字数０の空文字を示すStringオブジェクト
		Object obj4 = "";
		System.out.println(obj4 + "←空白あるで");
	}
//結果
//null
//false
//←空白あるで
}
