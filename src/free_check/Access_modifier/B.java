package free_check.Access_modifier;

public class B extends A{

	public void sameMethod() {
		System.out.print("Bから呼び出した");
		methodA();
	}

}
