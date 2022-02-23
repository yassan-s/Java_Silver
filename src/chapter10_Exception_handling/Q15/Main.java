package chapter10_Exception_handling.Q15;

public class Main {

	public static void main(String[] args) {
		A a = new A(10);
		B b = new B(10);
		System.out.println(a.equals(b));
	}
}
// ClassCastException
// 継承関係や実現関係にないクラスをキャストしようとしている
