package chapter8_lambda.test;

@FunctionalInterface
public interface testInterface {
	// 1つだけ抽象メソッドを記入することができる
	public abstract void method(int x);
}
