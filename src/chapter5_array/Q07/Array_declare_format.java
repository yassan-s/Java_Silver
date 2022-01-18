package chapter5_array.Q07;

public class Array_declare_format {

	public static void main(String[] args) {

		// 同じ意味
		int[]array1 = {1, 2, 3};
		int[]array2 = new int[] {1, 2, 3};

		// コンパイルエラー 初期化する場合、要素数を指定してはいけない
		int[]array3 = new int[3] {1, 2, 3};

		// 意味はないが、文法的に問題ない
		int[]array4 = {};
		int[]array5 = new int[0];

		// 2次元配列をまとめて初期化
		int[][]array6 = {{1, 2}, {3, 4, 5}};

		// コンパイルエラー 次元数が異なる 初期化をカウントしないように！
		int[][]array7 = new int[] {};
		// これならOK
		int[][]array8 = new int[][] {};

		// 分割して初期化できる 次元数を明示してるからOK
		int[]array9;
		array9 = new int[] {1, 2, 3};
		// コンパイルエラー 次元数を自動算出できない
		int[]array10;
		array10 = {1, 2, 3};

	}

}
