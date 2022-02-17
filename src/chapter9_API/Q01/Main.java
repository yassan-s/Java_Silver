package chapter9_API.Q01;

public class Main {

	public static void main(String[] args) {
		// 毎年積立を行って複利運用した時の金額を求める

		// 毎年の積立額
		int m = 10000;
		// 年利率
		double r = 0.03;
		// 年数
		int x = 10;

		// 受け取り総額
		int n = (int)(m * (Math.pow((1 + r), x) - 1) / r);
		System.out.println("受け取り金額は " + n + "円");
	}
}

// Mathクラス
// powメソッド：累乗するために使用する
// pow(2, 3) 2の3乗

// sqrtメソッド：平方根を求める時に使用する
