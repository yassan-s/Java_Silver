package chapter7_extends_interface_abstract.Q17;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		B b = (B) a;
		b.hello();
	}
}

// 実行時に例外がスローされる
// 明示的にキャストしているので、コンパイルエラーは発生しない
// A a にはクラスAのインスタンスが参照されている
// この参照が B bに代入されているので、参照先のインスタンスはクラスAである
// したがって、変数の型を変更することはできるが、インスタンスは変更できない

