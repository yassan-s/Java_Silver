package chapter7_extends_interface_abstract.Q21;

public class Parent {
	public Parent() {
		System.out.println("A");
	}

	public Parent(String val) {
		this();
		System.out.println(val);
	}
}
