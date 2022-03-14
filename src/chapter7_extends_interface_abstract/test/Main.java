package chapter7_extends_interface_abstract.test;

public class Main {

	public static void main(String[] args) {
		A a = new B();
		a.methodA();
		// a.methodB(); コンパイルエラー

		C c = new D();
		c.methodC();
		// c.methodD(); コンパイルエラー
		c.methodZ();

		D d = new D();
		d.methodC();
		d.methodZ();
	}
}
//OverrideしたmethodAを使用
//methodCを使用
//methodZを使用 Dクラス
//methodCを使用
//methodZを使用 Dクラス

