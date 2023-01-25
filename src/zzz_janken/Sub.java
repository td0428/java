package zzz_janken;

import java.util.Random;

public class Sub {
	private int a;
	private int b;
	int c;
	String myhand;
	String youhand;
	Random rand = new Random();

	public void jan(int a) {
		if (a == 1 || a == 2 || a == 3) {
			if (a == 1) {
				this.a = 0;
				this.myhand = "グー";
			} else if (a == 2) {
				this.a = 1;
				this.myhand = "チョキ";
			} else if (a == 3) {
				this.a = 2;
				this.myhand = "パー";
			}
			b = rand.nextInt(3);
		} else {
			System.out.println("「0」「1」「2」のみ");
			System.exit(0);
		}

	}

	public int kekka() {
		if (b == 0) {
			this.youhand = "グー";
		} else if (b == 1) {
			this.youhand = "チョキ";
		} else if (b == 2) {
			this.youhand = "パー";
		}
		return c = (a - b + 3) % 3;

	}
}
