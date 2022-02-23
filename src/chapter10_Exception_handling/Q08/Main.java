package chapter10_Exception_handling.Q08;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("A");
		} finally {
			System.out.println("B");
		} finally {
			System.out.println("C");
		}
	}
}
// コンパイルエラー
// tryブロックとfinallyブロックは1つのみ、catchブロックは複数記述可能
// 例外の種類により、処理内容を変更できるようにするため複数かける
