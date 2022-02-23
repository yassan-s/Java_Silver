package chapter10_Exception_handling.Q06;

public class Main {

	public static void main(String[] args) {
		int result = sample();
		System.out.println(result); // 20
	}
	private static int sample() {
		try {
			throw new RuntimeException();
		} catch (RuntimeException e) {
			return 10;
		} finally {
			return 20;
		}
	}
}
// 20
// returnで戻るときに戻り値を格納する専用の変数が用意される
// catchブロックでは、10が格納される
// 次のfinallyブロックにて、20に変更される