package chapter1_package.test1;

public class Main {

	public static void main(String[] args) {
		// sample1はインスタンス生成できる
		Sample1 sample1 = new Sample1();
		// sample2はインスタンス生成できない
		Sample2 sample2 = new Sample2();

		// 検証結果
		System.out.println(sample1.greet());
		System.out.println(sample2.greet());
	}

}
