package chapter3_operator.Q15_;

public class Main {

	public static void main(String[] args) {
		int num = 10;
		// thenは使えない {}は省略可能
		if (num >= 10)
			System.out.println("OK"); //OK

		if (false)
			System.out.println("A"); //表示されない if文内にある
			System.out.println("B"); //B if文とは無関係

	}

}
