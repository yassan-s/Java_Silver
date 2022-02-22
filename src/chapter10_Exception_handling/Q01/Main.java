package chapter10_Exception_handling.Q01;

public class Main {

	public static void main(String[] args) {
		try {
			int array[] = {};
			array[0] = 10;
			System.out.println("finish");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error"); // error
		}
	}
}
// 要素数0の配列を作り、１番目の要素に10を代入しようとしている
// 要素外アクセスをしようとしているので、catchブロックに移動する
