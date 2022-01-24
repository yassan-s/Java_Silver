package chapter6_instance_method.Q25;

public class Sample {

	public Sample() {
		System.out.println("A");
		// コンパイルエラー thisは一番最初に記述する必要がある
		this("B");
	}
	public Sample(String str) {
		System.out.println(str);
	}
}
