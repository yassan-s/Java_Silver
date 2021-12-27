package chapter3_operator.Q10;

public class Main {

	public static void main(String[] args) {

		Sample a = new Sample(10);
		Sample b = new Sample(10);

		System.out.println(a.equals(b)); //false
		System.out.println(a.getThis()); //chapter3_operator.Q10.Sample@7344699f
		System.out.println(b.getThis()); //chapter3_operator.Q10.Sample@6b95977

	}

}
