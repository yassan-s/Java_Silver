package chapter3_operator.Q08_9;

public class Main {

	public static void main(String[] args) {

        String st1 = new String("Sample");
        String st2 = st1;
        System.out.println(st1 == st2); //true
        System.out.println(st1.equals(st2)); //true
        System.out.println("=====");

        String st3 = new String("Sample");
        String st4 = new String("Sample");
        System.out.println(st3 == st4);  //false
        System.out.println(st3.equals(st4)); //true
        System.out.println("=====");

		String sample1 = "Sample";
		String sample2 = "Sample";
		System.out.println(sample1 == sample2); //true
		System.out.println(sample1.equals(sample2)); //true

	}

}
