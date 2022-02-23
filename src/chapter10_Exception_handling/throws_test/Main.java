package chapter10_Exception_handling.throws_test;

public class Main {

	public static void main(String[] args) {
		Item item = new Item();
		try {
			item.call();
		} catch (Exception e) {
			System.out.println("問題あり");
		}
	}
}
// throws
// メソッド宣言時にthrowステートメントを加えることで、
// 例外処理を呼び出し元に譲渡する
