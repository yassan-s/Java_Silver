package sukkiri;

public class Main {

	public static void main(String[] args) {
		System.out.println("戦闘開始!");
		System.out.print("スライムが現れた！");
		Hero hero = new Hero();
		suraimu sura = new suraimu();


		System.out.print("勇者の攻撃！");
		hero.attack(sura);
		System.out.println("スライムのHPは" + sura.hp);

		if (sura.hp == 0) {
			System.out.print("勇者の勝利！");

		}
	}
}
