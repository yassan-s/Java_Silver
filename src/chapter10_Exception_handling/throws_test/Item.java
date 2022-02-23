package chapter10_Exception_handling.throws_test;

public class Item{
	String name;
	int price;

	public Item() {
		this.name = "book";
		this.price = 1000;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public void call() throws Exception{
		int[]array = {};
		array[0] = 10;
	}
}
