package sukkiri;

public class Hero {

	  String name;
	  int hp = 50;

	void sleep() {
	    this.hp = 100;
	    hp = 50;
	    System.out.println(this.name + "は、眠って回復した！");
	  }

	public void attack(suraimu sura) {
		sura.hp -= 10;
	}

}