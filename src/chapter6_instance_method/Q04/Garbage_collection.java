package chapter6_instance_method.Q04;

public class Garbage_collection {

	public static void main(String[] args) {
		Object a = new Object();
		Object b = new Object();
		Object c = a;
		a = null;
		b = null;
	}
// ガベージコレクションの対象
// Object a = new Object(); Object c に参照があるので、aがnullでも対象にならない
// Object b = new Object(); 削除対象
}
