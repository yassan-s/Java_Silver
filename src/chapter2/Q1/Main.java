package chapter2.Q1;

public class Main {

	public static void main(String[] args) {
		int val = 7;
		// コンパイルエラーが発生
		// 正しくは boolean
		bool flg = true;
		if (flg == true){
			do {
				System.out.println(val);
			} while (val > 10);
		}

	}

}
