package chapter9_API.Q03;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[] {1,2,3});
		// 昇順の逆 「-」をつけることで降順にできる
		list.sort((a, b) -> -a.compareTo(b));
		for (Integer num : list) {
			System.out.println(num); // 3 2 1
		}
	}

}
