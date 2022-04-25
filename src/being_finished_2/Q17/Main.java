package being_finished_2.Q17;

public class Main {

	public static void main(String[] args) {
		int[]array;
		array = new int[]{};

		// コンパイルエラー
		int[]array2;
		array = new int[2];
		array2 = {1, 2};

		// コンパイルエラー
		int[]array3;
		array3 = new int[2]{1, 2};

		// コンパイルエラー
		int[]array4 = new int[2] {1,2};

		// サイズ指定しなければOK
		int[]array5 = new int[] {1,2};

		int[]array6 = {1,2};

		int[]array7 = new int[2];
	}

}
