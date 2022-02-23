package chapter10_Exception_handling.throw_test;

public class Main {

	public static void main(String[] args) {
		int num = -1;

		try {
			if (num < 0) {
				throw new Exception("throwされた");
				//System.out.println("throwされていない");
			}
		} catch (Exception e) {
			System.out.println("throwされた");
			//e.printStackTrace();
		}
	}
}
// throw
// 例外が発生次第、catchブロックに移動する