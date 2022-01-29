package chapter3_operator.Q08_9;

public class Main2 {

	public static void main(String[] args) {
		Sample s1 = new Sample(10);
		Sample s2 = s1;
		s1 = new Sample(20);
		System.out.println(s1 == s2); // false

		System.out.println(s1.getNum()); // 20
		System.out.println(s2.getNum()); // 10

	}

}
