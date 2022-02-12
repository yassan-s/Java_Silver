package chapter8_lambda.Q03;

public class Main {

	public static void main(String[] args) {
		String val = "A";
		Function f = (val) -> {
			System.out.println(val);
		};
		f.test("B"); // コンパイルエラー

		// 7行目のvalはString val と同じ意味になる
		// 6行目で既に宣言されているので、コンパイルエラーになる
	}

	interface Function{
		void test(String val);
	}

}
