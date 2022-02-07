package chapter8_lambda.test;

public class Main {

	public static void main(String[] args) {

		testInterface test = (int x) -> {System.out.println(x + x);};
		test.method(1);

	}
}
