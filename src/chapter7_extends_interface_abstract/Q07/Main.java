package chapter7_extends_interface_abstract.Q07;

public class Main implements A, B {

	public static void main(String[] args) {
		new Main().test();
	}

	// どちらのtest()メソッドを呼び出すもしくは、
	// 全く違う処理を上書きする必要がある
	// 以上の処理をしないとコンパイルエラー
	@Override
	public void test() {
		System.out.println("C");
		// 親クラスのdefaultメソッドを呼び出す
		A.super.test();
	}

}
