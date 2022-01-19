package chapter5_array.Q05_6;

public class Array_element {

	public static void main(String[] args) {
		Item[]array = new Item[3];
		int total = 0;
		for(int i = 0; i < array.length; i++) {
			total += array[i].price;
		}
		System.out.println(total); // nullPointerException をスローする
		// Itemインスタンスは生成されていないので、デフォルト値のnull
	}
}
