package chapter3_operator.Q01_4;

public class Double_float {

	public static void main(String[] args) {
        double d1 = 10.0;
        double d2 = 3.0;
        double d = d1/d2;
        System.out.println("double d : "+d);

        float f1 = 10.0f;
        float f2 = 3.0f;
        float f = f1/f2;
        System.out.println("float f : "+f);

        float f3 = (float) d;
        System.out.println("float f3 : "+f3);

        double d3 = f;
        System.out.println( "double d3 : "+d3);

        float f4 = 10.123456f;
        System.out.println(f4);

        double d4 = 10.123456789;
        System.out.println(d4);
	}

}
