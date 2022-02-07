package chapter7_extends_interface_abstract.Q20;

public class B extends A{
	public B() {
		// ↓ コンパイラにより自動的に追加される
		// 継承元の基盤を作成後に、差分を追加するイメージ
		// super();
		System.out.print("B");
	}
}
