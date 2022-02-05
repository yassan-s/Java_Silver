package chapter7_extends_interface_abstract.Override;

public class Main {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.greet(); // evening

		Parent pa = new Child();
		pa.greet(); // evening
		// pa.play(); // コンパイルエラー Parentクラスでは定義されていない

	}

}
