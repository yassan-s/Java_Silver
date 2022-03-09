package chapter7_extends_interface_abstract.test;

public class B implements A {
	@Override
	public void methodA() {
		System.out.println("OverrideしたmethodAを使用");
	}

	public void methodB() {
		System.out.println("methodBを使用");
	}
}
