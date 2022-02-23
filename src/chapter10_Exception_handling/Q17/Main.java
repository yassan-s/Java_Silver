package chapter10_Exception_handling.Q17;

public class Main {

	public static void main(String[] args) {
		main(args);
	}
}
// StackOverflowError
// 同じメソッドを呼び出し続ける「再帰呼び出し」を行うと、スタック領域が足りなくなる
// これをJVMが検知すると、StackOverflowErrorをスローしてプログラムを強制終了する
