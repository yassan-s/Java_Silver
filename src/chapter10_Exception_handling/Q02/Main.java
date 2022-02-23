package chapter10_Exception_handling.Q02;

//実行時の起動パラメータは何も渡さないこととする
public class Main {

	public static void main(String[] args) {
		try {
			if (args.length == 0) {
				System.out.println("A");
			}
		} catch (NullPointerException e) {
			System.out.println("B");
		} finally {
			System.out.println("C");
		}
	} // A C
}
// 起動パラメータがないので、lengthの結果は0
// tryブロック後にfinallyブロックに移動する
