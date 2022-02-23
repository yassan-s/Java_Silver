package chapter10_Exception_handling.Q07;

public class Main {

	public static void main(String[] args) {
		int result = sample();
		System.out.println(result);
	}

	private static int sample() {
		int val = 0;
		try {
			String[]array = {"A", "B", "C"};
			System.out.println(array[3]);
		} catch (RuntimeException e) {
			val = 10;
			return val;
		} finally {
			val += 10;
		}
		return val;
	}
}
// 10
// finallyブロックで値を変更しても、変数valが変わるだけで、
// 戻り値の変数が変更されるわけではない