package chapter7_extends_interface_abstract.Q16;

public class Main {

	public static void main(String[] args) {
		A a = new B();
		B b = (B) a;
		b.hello(); // hello

		// 親から子クラスには明示的にキャストを記述する必要がある

		// コンパイルエラー クラスAにはhello()メソッドはない
		a.hello();
	}

}
