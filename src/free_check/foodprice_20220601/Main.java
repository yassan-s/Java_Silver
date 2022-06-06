package free_check.foodprice_20220601;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// 商品の一覧を準備
		// 同じ名前で別価格の商品は、存在しないものとする
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product("ポップコーン", 470, 1));
		list.add(new Product("ホットドック", 400, 1));
		list.add(new Product("コーラ", 320, 0));
		list.add(new Product("烏龍茶", 270, 0));

		// スタッフが注文をとる
		Staff staff = new Staff();
		String order1 = staff.takeOrder(1);
		String order2 = staff.takeOrder(2);
        System.out.println("注文内容 " + order1 + " : " + order2);

        // 一時保存用リスト
        ArrayList<Product> wkList = new ArrayList<Product>();

        // 注文した商品が存在しているのかチェックする
        // 注文が０、１種類の場合はまだ実装できていない
        for (Product product : list) {
        	if (order1.equals(product.getName())) {
        		wkList.add(product);
        	}
        	if (order2.equals(product.getName())){
        		wkList.add(product);
        	}
        }

        // wkListの内容によって分岐する
        if (wkList.size() == 0) {
        	System.out.println("該当するメニューがありませんでした");
        	return;
        } else if (wkList.size() == 1) {
        	System.out.println("お支払いは "+ wkList.get(0).getPrice());
        	return;
        }

        // 注文を復唱する(コンソールに表示)
        staff.repeatOrder(wkList);

        // 配列から商品を取り出す
        Product p1 = wkList.get(0);
        Product p2 = wkList.get(1);

        // 現状の支払い金額
        int amount = p1.getPrice() + p2.getPrice();

        // FoodとDrinkの組み合わせの場合、-50円する
        if ((p1.getFoodCheckFlag() == 0 & p2.getFoodCheckFlag() == 1 ) ||
        		(p1.getFoodCheckFlag() == 1 & p2.getFoodCheckFlag() == 0)) {
        	amount -= 50;
        	System.out.println("お支払いは "+ amount);
        } else {
        	System.out.println("お支払いは "+ amount);
        }
	}

}
