package chapter8_lambda.Q04;

public class Main {

	public static void main(String[] args) {
		int cnt = 0;
		Runnable r = () -> {
			for (cnt = 0; cnt < 10; cnt++) {
				System.out.println(cnt++);
			}
		};
		new Thread(r).start();
	}
}
// コンパイルエラー
// 実施的なfinalな変数でなければ、ラムダ式外から中ヘはアクセルできない