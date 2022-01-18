package chapter5_array.Q02_4;

public class Array_declare {

	int[]array1 = new int[3];

	// []と変数名は逆でも問題なし
	int b[];

	// 2次元配列
	int[][]array2;

	// 3次元配列
	int array3[][][];

	// 分けて記述することも可能
	int[]array4[];
	int[][]array5[];

	// コンパイルエラー 要素数を指定する必要がある
	int[]array6 = new int[];

	// コンパイルエラー 要素数はint型 long型は×
	int[]array7 = new int[1.2];

	// 2次元配列のインスタンス生成
	int[][]array8 = new int[3][4];

	// 式を利用できる
	int c = 1; int d = 2;
	int[]array9 = new int[c * d];

	// 2次元目は後から生成できる
	int[][]array10 = new int[3][];
	// コンパイルエラー 1次元目は省略できない
	int[][]array11 = new int[][3];

	// コンパイルエラー 変数とインスタンスでの次元数は一致させる
	int[]array12 = new int[4][4];
}
