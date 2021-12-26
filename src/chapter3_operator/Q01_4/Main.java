package chapter3_operator.Q01_4;

public class Main {

	public static void main(String[] args) {
		int a = 3;
		int b = a += 5; //1.a = a+5 2.b = a
		System.out.println(a); //8
		System.out.println(b); //8

		//コンパイルエラー int に longを格納使用としている
		//int c = 2 * 3L;

		int d = 10;
		int e = d++ + d + d-- - d-- +  ++d; // 10 11 11 10 10
		System.out.println(e); //32

		int f = 10;
		int g = f++ + f; // 10 11
		System.out.println(g); //21
		int h = 10;
		int i = ++h + h; // 11 11
		System.out.println(i); // 22

		int j = 10;
		j++;
		System.out.println(j); // 22
	}

}
