package free_check.foodprice_20220601;

public class Product {

	private String name;
	private int price;
	// 0 drink, 1 food
	private int foodCheckFlag;

	public Product(String name, int price, int foodCheckFlag) {
		this.name = name;
		this.price = price;
		this.foodCheckFlag = foodCheckFlag;
	}

	public Product() {}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getFoodCheckFlag() {
		return foodCheckFlag;
	}


}
