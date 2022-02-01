package chapter7_extends_interface_abstract.Q07;

public interface B {
	default void test() {
		System.out.println("B");
	}
}
