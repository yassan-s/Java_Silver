package chapter6_instance_method.Q16;

public class Calc {

	int calc(double a, int b) {
		return (int) a * b;
	}

	///// 以下は４つはオーバーロードと認識できている /////
	// 引数の数が違う
	int calc(int a) { return 1;}

	// 引数の型が違う
	int calc(double a, double b) { return 1;}

	// 引数の数が違う
	int calc( ) { return 1;}

	// 引数の順番が違う
	int calc(int b, double a) { return 1;}


	///// 以下はコンパイルエラー /////
	// 戻り値型は関係なし
	// double calc(double a, int b) { }

	// 引数の変数名も関係なし
	// int calc(double num1, int num2) { }

}
