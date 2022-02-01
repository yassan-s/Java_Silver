package chapter7_extends_interface_abstract.Q04;

public class Main {

	public static void main(String[] args) {
		A a = new B();
		a.sample(); //sample
		System.out.println(a.PI); // 3.14

		// System.out.println(a.ClassB());
		// A型のクラスなので、クラスBのメソッドは使用できない
	}

}
