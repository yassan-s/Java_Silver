package free_check;

public class Main {

	static int num = 23;

	public static void main(String[] args) {
//		String val = "A";
//
//		int total = 0;
//
//		int[]numbers = {1, 2, 3, 4, 5};
//
//		for(int i = 0; i < numbers.length; i++) {
//			total += numbers[i];
//		}
//
//		System.out.println(total);

		// numが初期化されていない
		// 変数名のみだローカル変数と解釈される
		int num = num;

	}
}
