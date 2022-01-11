package chapter4_control_structure.Q01_3;

public class Do_while {

	public static void main(String[] args) {

		int num = 0;

		//必ず1回は処理が実行される
		do {
			//出力した後に num = num + 1 が処理される
			System.out.println("num = " + num++);
			System.out.println("num++ の結果は " + num);
		} while (num < 5);
	}
//答え
//	num = 0
//	num++ の結果は 1
//	num = 1
//	num++ の結果は 2
//	num = 2
//	num++ の結果は 3
//	num = 3
//	num++ の結果は 4
//	num = 4
//	num++ の結果は 5
}
