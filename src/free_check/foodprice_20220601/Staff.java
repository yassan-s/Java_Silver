package free_check.foodprice_20220601;

import java.util.ArrayList;
import java.util.Scanner;

public class Staff {

	private Scanner sc;

	public Staff() {
		this.sc = new Scanner(System.in);
	}

	// 注文をとる
	public String takeOrder(int count) {
		System.out.println(count +  "つ目の注文は？");
        String order = sc.nextLine();
        return order;
	}

	// 注文を復唱する
	public void repeatOrder(ArrayList<Product> wkList) {
        for (Product product : wkList) {
        	System.out.println(product.getName());
        	System.out.println("=====");
        }
	}
}
