package chapter4_control_structure.Q14_15;

public class Continue {

	public static void main(String[] args) {
		int [] array = {1, 2, 3};
		int total = 0;
		for (int i : array) {
			if (i % 2 == 0) {
				continue;
			}
			total += i;
		}
		System.out.println(total); // 4
	}

}
