package chapter4_control_structure.Q04_13;

public class For_array {

	public static void main(String[] args) {

		int array [][] = new int[][] {{1,2}, {2, 3, 4}};
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array[i].length; j++ ) {
				total += array[i][j];
			}
		}
		System.out.println(total); //10

		// 不規則な長さの配列が2つある
		int array2 [][] = new int[][] {{1,2}, {2, 3, 4}};
		System.out.println(array2.length);      // 2
		System.out.println(array2[0].length);   // 2
		System.out.println(array2[1].length);   // 3
		System.out.println(array2[1][2]);       // 4

		// イメージは縦が長い長方形
		int[][] num = new int[100][3];
		System.out.println(num.length);      // 100
		System.out.println(num[0].length);   // 3
		System.out.println(num[99].length);  // 3
	}

}
