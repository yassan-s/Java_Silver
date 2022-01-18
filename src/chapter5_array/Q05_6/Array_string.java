package chapter5_array.Q05_6;

public class Array_string {

	public static void main(String[] args) {
		String[]array = {"A", "B", "C"};
		array[0] = null;
		for(String str : array) {
			System.out.print(str); // nullBC
		}

		// nullはどこも参照していないことを表す「リテラル」である
		// なので、printで表示される
	}
}
