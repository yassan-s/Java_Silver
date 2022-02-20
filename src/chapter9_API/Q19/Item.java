package chapter9_API.Q19;

public class Item {
	private int id;
	private String name;
	public Item(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
}
