package chapter7_extends_interface_abstract.Q19;

public class Main {

	public static void main(String[] args) {
		Child child = new Child();
		child.name = "sample";
		System.out.println(child.getName()); // null
	}
}

// getName()メソッドは、Parentクラスに定義されており、
// このthisはParentのインスタンスを示している
// したがって、Parentのインスタンスのnameフィールドは空なので、nullになる