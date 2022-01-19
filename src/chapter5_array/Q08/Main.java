package chapter5_array.Q08;

public class Main {

	public static void main(String[] args) {
		String[][]array = {{"A", "B"}, null, {"C", "D", "E"}};
		int total = 0;
		for (String[] str : array) {
			total += str.length;
		}
		System.out.print(total); // nullPointerException をスローする
	}
	// nullは参照先が存在しないことを表している
	// 参照先がないので、配列そのものも存在しない
}
