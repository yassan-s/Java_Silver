package chapter7_extends_interface_abstract.Q12;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		A b = new B();
		System.out.print(a.val);
		System.out.print(b.val);
		a.print();
		b.print();
	}

}

// フィールドを参照した場合には、変数の型で宣言された方を使う
// メソッドを呼び出した場合には、メソッド内の指示に従う

// AAAA
