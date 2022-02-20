package chapter9_API.Q11;

public class Item {
	private String name;
	private int price;
	public Item (String name, int price) {
		this.name = name;
		this.price = price;
	}

	public boolean equals(Object obj) {
		// 同じインスタンスであればtrue
		if (obj instanceof Item) {
			Item tmp = (Item) obj;
			if (tmp.name.equals(this.name)) {
				return true;
			}
		}
		return false;
	}

	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}
}
