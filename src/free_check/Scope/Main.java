package free_check.Scope;

public class Main {

	public static void main(String[] args) {
		int num1 = 0;
		while (num1 < 2) {
			System.out.println(num1++);
		}
		System.out.println("結果 "+ num1);

		int num2 = 0;
		if (num2 == 0) {
			int num3 = 10;
		}
		// System.out.println(num3); // scope外
	}

}
