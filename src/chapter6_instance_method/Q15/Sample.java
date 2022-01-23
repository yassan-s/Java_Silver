package chapter6_instance_method.Q15;

public class Sample {

	public void method(int num) {

		if (num < 0) {
			return;
		}
		System.out.print(num);
		return;
		// コンパイルエラー returnで制御を戻しているので、到達できない
		System.out.print(num);
	}

}
