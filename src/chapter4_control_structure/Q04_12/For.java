package chapter4_control_structure.Q04_12;

public class For {

	public static void main(String[] args) {

		for (int i = 0, j = 2; i < 5; i++) {
			System.out.println(i*j);
		}
		// コンパイルエラー 変数の初期化部分を同じ型にする必要がある
		// for (int i = 0, long j = 2; i < 5; i++) {
		//	 System.out.println(i*j);
		// }

		// コンパイルエラー scope外で変数totalを使用している
		// int a = 0;
		// for (int b = 2, total = 0; b < 5; b++) {
		//	 total = a*b;
		// }
		// System.out.println(total);
	}
//答え
// 0
// 2
// 4
// 6
// 8
}
