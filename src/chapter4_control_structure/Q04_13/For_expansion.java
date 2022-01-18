package chapter4_control_structure.Q04_13;

public class For_expansion {

	public static void main(String[] args) {
		String [][] array = {{"A", "B", "C"},{"D", "E"}};
		for (Object obj : array) {
			System.out.println(obj);
			// [Ljava.lang.String;@1dbd16a6
			// [Ljava.lang.String;@7ad041f3
		}

		int[] array1 = {1, 2, 3};
		int total = 0;
		for (int i : array1) {
			System.out.println(i); //1 2 3 を順番に表示
			total += i;
		}
		System.out.println(total); // 6

		String[]array2 = {"A", "B", "C"};
		for (String str : array2) {
			str = "D";
		}
		for (String str : array2) {
			System.out.print(str);
		}
	}
}
