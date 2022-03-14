package free_check.Coverage;

import java.util.Scanner;

public class Coverage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 標準入力

		System.out.println("Movie or Game");
		System.out.println("↓ 入力待ち");
		String str = scan.nextLine(); // 1行分の入力を取得する
		System.out.println(str + " を選択");

		System.out.println("**********");
		System.out.println("所持金は?");
		System.out.println("↓ 入力待ち");
		int money = scan.nextInt(); // 数値の入力を取得する
		System.out.println("所持金は " + money);

		System.out.println("**********");
		System.out.println("今日は");
		if (str.equals("Movie")) {
			if (money >= 1900) {
				System.out.println("映画をみる");
			} else {
				System.out.println("ゲームする");
			}
		} else if (str.equals("Game")) {
			System.out.println("ゲームする");
		} else {
			System.out.println("入力ミスです");
		}
	}
}
