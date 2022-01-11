package chapter3_operator.Q15_18;

public class Main {

	public static void main(String[] args) {
		int num = 10;
		// thenは使えない {}は省略可能
		if (num >= 10)
			System.out.println("OK"); //OK

		if (false)
			System.out.println("A");
			System.out.println("B");

		int num1 = 2;
		if (num1 % 2 == 0) {
			System.out.println("偶数です");
			return;
		}
		System.out.println("奇数です");
	}

}
