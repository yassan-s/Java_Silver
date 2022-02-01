package chapter7_extends_interface_abstract.Q05;

public interface A {

	// java.lang.Objectクラスは、インタフェースでデフォルトメソッドとして
	// オーバーライドするとコンパイルエラーになる
	@Overrdie
	default String toString() {
		return "A";
	}
}
