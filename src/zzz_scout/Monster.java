package zzz_scout;

public class Monster {
	static int hp;
	static int TopHp;
	String name;
	int attack;

	public void select(int a) {
		if (a == 1) {
			this.hp = 100;
			this.TopHp = 100;
			this.name = "スライム";
			this.attack = 2;
		} else if (a == 10) {
			this.hp = 150;
			this.TopHp = 150;
			this.name = "ゴーレム";
			this.attack = 5;
		} else if (a == 100) {
			this.hp = 200;
			this.TopHp = 200;
			this.name = "ドラゴン";
			this.attack = 7;
		}
	}
}
