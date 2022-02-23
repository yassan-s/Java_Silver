package chapter10_Exception_handling.Q10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		try (FileInputStream is = new FileInputStream("sample.txt")) {
			throw new FileNotFoundException();
		} catch (Exception e) {
			System.out.println("A");
		} finally {
			if (is != null) {
				is.close();
			}
		}
		System.out.println("B");
	}
}
// コンパイルエラー
// tryブロックで宣言したリソースは、tryブロックから遷移するときに、
// 自動的にcloseされる
// finallyブロックからは参照できない
