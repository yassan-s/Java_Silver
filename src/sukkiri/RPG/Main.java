package sukkiri.RPG;

import java.util.ArrayList;

import sukkiri.RPG.enemy.Monster;
import sukkiri.RPG.enemy.Skeleton;
import sukkiri.RPG.enemy.Slime;

public class Main {

	public static void main(String[] args) {
		ArrayList<Monster> enemyList = new ArrayList <Monster>();

		enemyList.add(new Slime());
		enemyList.add(new Skeleton());

		for (Monster monster : enemyList) {
			monster.attack();
		}
	}
}
