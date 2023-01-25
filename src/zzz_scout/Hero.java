package zzz_scout;

import java.util.Random;

public class Hero {
	int hp = 50;
	int attack;
	Random rand = new Random();

	public void attack() {
		int r = rand.nextInt(5);
		if (r == 0) {
			this.attack = 30;
		} else {
			this.attack = 10;
		}
	}
}
