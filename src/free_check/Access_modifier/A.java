package free_check.Access_modifier;

public class A {

	public void sameMethod() {
		System.out.print("Aから呼び出した");
	}

	private void methodA() {
		System.out.println("BからAを呼び出した");
	}
}
