package chapter8_lambda.Q02;

public class Main {

	public static void main(String[] args) {

		// {}がある場合は、returnは省略できない
		Function f = (name) -> {
			return "hello " + name;
		};
		// 処理が１つかつ{}がない場合は、returnを記述できない
		Function f2 = (name) ->  "hello " + name;

 		System.out.println(f.test("Lambda")); // hello Lambda
 		System.out.println(f2.test("Lambda2")); // hello Lambda2
	}

	private static interface Function {
		String test(String name);
	}
}
