package chapter6_instance_method.Q17;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		System.out.print(m.calc(2, 3)); // コンパイルエラー
	}

	private double calc(double a, int b) {
		return (a + b) / 2;
	}

	private double calc(int a, double b) {
		return (a + b) / 2;
	}
}
