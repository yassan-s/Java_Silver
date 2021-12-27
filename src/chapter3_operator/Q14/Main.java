package chapter3_operator.Q14;

public class Main {

	public static void main(String[] args) {
		String str1 = new String("def");
		String str2 = new String("def");

		//str1とstr2の参照先を比較している
		System.out.println(str1.intern() == str2.intern()); //true
	}

}
