package chapter7_extends_interface_abstract.Q04;

public interface A {

	// インスタンス化しなくても使えるので、実装可能
	// public static finalは省略可能
    public static final double PI = 3.14;

	default void sample() {
		System.out.println("sample");
	}

	// 記述可能
	// void sample1();

	// public abstractは省略可能
	// public abstract void hello();

	// コンパイルエラー {}により処理なしという中身を持っている
	// public abstract void hello(){}
}
