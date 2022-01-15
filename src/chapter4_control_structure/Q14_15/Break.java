package chapter4_control_structure.Q14_15;

public class Break {

	public static void main(String[] args) {
		int num = 0;
		while (true) {
			if (num == 2){
				break;
			}
			System.out.println(num); // 0 1
			num++;
		}
	}
}
