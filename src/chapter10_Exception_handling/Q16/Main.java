package chapter10_Exception_handling.Q16;

public class Main {

	public static void main(String[] args) {
		String str = null;
		if (str.equals(" ")) {
			System.out.println("blank");
		} else {
			System.out.println("null");
		}
	}
}
// NullPointerException
// nullは、リテラルの一種で参照が何もないことを表している
// nullに対してメソッドを呼び出そうとすると、例外が発生する