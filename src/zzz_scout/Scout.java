package zzz_scout;

public class Scout extends Janken {
	Monster m = new Monster();
	double percent;
	int d;
	int scout = 0;

	public void jan(int a) {
		if (a == 1) {
			this.a = 0;
			this.myhand = "グー";
		} else if (a == 2) {
			this.a = 1;
			this.myhand = "チョキ";
		} else if (a == 3) {
			this.a = 2;
			this.myhand = "パー";
		} else if (a == 00) {
			scout();
		}
		b = rand.nextInt(3);

	}

	public double percent() {
		return percent = (1 - (double) m.hp / (double) m.TopHp) * 100.0;
	}

	public void scout() {
		d = rand.nextInt(100) + 1;
		if (0 < d && d < percent) {
			scout = 1;
		} else {
			scout = 2;
		}
	}
}
