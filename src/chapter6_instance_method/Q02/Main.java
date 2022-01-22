package chapter6_instance_method.Q02;

public class Main {

	public static void main(String[] args) {
		Item item1 = new Item();
		item1.price = 100;
		item1.name = "Item";
		System.out.println(item1.price); // 100
		item1.printInfo();

	}

}
