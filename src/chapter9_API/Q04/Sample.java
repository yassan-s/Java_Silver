package chapter9_API.Q04;

public class Sample {

	public static void main(String[] args) {
		char a = '0';
		int num = 0;
		// 引数がアルファベットか調べる true or false
		if (Character.isAlphabetic(a)) {
			num++;
		}
		// 引数が数字か調べる true or false
		if(Character.isDigit(a)) {
			num++;
		}
		// 引数が小文字か調べる true or false
		if(Character.isLowerCase(a)) {
			num++;
		}
		System.out.println(num); // 1
	}
}
// 数字の0は小文字に分類されていない