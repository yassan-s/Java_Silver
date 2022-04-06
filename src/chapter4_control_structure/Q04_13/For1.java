package chapter4_control_structure.Q04_13;

public class For1 {

	public static void main(String[] args) {

		int[]array = {1, 2, 3};
		int total = 0;
		for (int i : array) {
			System.out.println(i);
			total += i;
		}
		System.out.println(total);
	}

}
