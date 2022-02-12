package free_check;

public class Main {

	public static void main(String[] args) {
		String val = "A";

		int total = 0;

		int[]numbers = {1, 2, 3, 4, 5};

		for(int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}

		System.out.println(total);
	}
}
