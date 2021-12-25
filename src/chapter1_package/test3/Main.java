package chapter1_package.test3;

import chapter1_package.test3.sub1.Sample;

public class Main {

	public static void main(String[] args) {

		//パッケージ名は別、クラス名が同じ場合
		Sample sample = new Sample();

		// helloが表示される
		System.out.println(sample.greet());
	}

}
