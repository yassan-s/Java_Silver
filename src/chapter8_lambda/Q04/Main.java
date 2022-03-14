package chapter8_lambda.Q04;

public class Main {

	public static void main(String[] args) {
		// int cnt = 0;
		Runnable r = () -> {
			for (int cnt = 0; cnt < 10; cnt++) {
				System.out.println(cnt++);
			}
		};
		new Thread(r).start();
	}
}
// コンパイルエラー
// 実施的なfinalな変数でなければ、ラムダ式内から外の変数ヘはアクセスできない

// ラムダ式は宣言されたタイミングで使用されるわけではないので、
// 宣言後に変更されると意図しない動作をする可能性がある

// 10回回すだけなら、8行目でint cnt を宣言するとできる
// for (int cnt = 0; cnt < 10; cnt++) {