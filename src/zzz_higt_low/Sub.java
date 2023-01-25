package zzz_higt_low;

import java.util.Random;

public class Sub {
	Random rand = new Random();
	int a = rand.nextInt(13) + 1;
	int b;
	int c;
	int count;

	public void a(String a) {
		this.b = rand.nextInt(13) + 1;

		if (a.equals("h")) {
			if (this.a < this.b) {
				count += 1;
				this.a = this.b;
				c = 0;
			} else if (this.a > this.b) {
				count = 0;
				c = 1;
			} else if (this.a == this.b) {
				System.out.println("同じ数字が出た");
				this.a = this.b;
			}
		}
		if (a.equals("l")) {
			if (this.a < this.b) {
				count = 0;
				c = 1;

			} else if (this.a > this.b) {
				count += 1;
				this.a = this.b;
				c = 0;
			} else if (this.a == this.b) {
				System.out.println("同じ数字が出た");
				this.a = this.b;
			}
		}
	}
}