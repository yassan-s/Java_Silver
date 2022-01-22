package chapter6_instance_method.Q05;

public class Main {

	public static void main(String[] args) {
		Sample.num = 10;
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		s1.num +=10;
		s2.num = 50;
		System.out.println(Sample.num);
	}
}
