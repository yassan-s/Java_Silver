package chapter8_lambda.Q03;

public class Main {

	public static void main(String[] args) {
		String str = "A";
		Function f = (val) -> {
			System.out.println(val);
		};
		f.test(str); // A
		f.test("B"); // B

		// コンパイルエラー
//		Function f2 = (str) -> {
//			System.out.println(str);
//		};
	}
}
interface Function{
	void test(String val);
}
// 14行目のvalはString str と同じ意味になる
// 同じ名前の変数を再定義しようとしている
// 6行目で既に宣言されているので、コンパイルエラーになる