package chapter5_array.Q10;

public class Array_clone {

	public static void main(String[] args) {
		int[][]array1 = {{1, 2}, {1, 2},{1, 2, 3}};
		int[][]array2 = array1.clone();
		int total = 0;

		for (int[] array3 : array2) {
			for(int i : array3) {
				total += i;
			}
		}
		System.out.println(total); // 12
		System.out.println(array1 == array2); // false
	}
	// clone()は内容が全く同じ、別のインスタンスを生成する
	// したがって参照先はクローン元と一致しない
}
