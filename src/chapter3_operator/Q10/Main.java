package chapter3_operator.Q10;

public class Main {

	public static void main(String[] args) {

		// Object
		Object a = new Sample(10);
		Object b = new Sample(10);
		// Sample
		Sample c = new Sample(10);
		Sample d = new Sample(10);
		// System.out.println(b.num);

		System.out.println(a == b); //false
		System.out.println(a.equals(b)); //false
		System.out.println(c == d); //false
		System.out.println(c.equals(d)); //true
		System.out.println(c.getThis()); //chapter3_operator.Q10.Sample@7344699f
		System.out.println(d.getThis()); //chapter3_operator.Q10.Sample@6b95977

	}

}
