package zzz_keisanki;

import java.util.ArrayList;
import java.util.List;

public class Sub {
	private int q;
	private boolean TestTasu;
	private boolean TestHiku;
	private boolean TestKake;
	private boolean TestWaru;
	List<String> List = new ArrayList<String>();

	//	最初の演算子の分岐
	public void setint(String a, int b, int c) {
		if (a.equals("tasu")) {
			tasu(b, c);
		} else if (a.equals("hiku")) {
			hiku(b, c);
		} else if (a.equals("kake")) {
			kake(b, c);
		} else if (a.equals("waru")) {
			waru(b, c);
		}

	}

	//	最初の計算と式用の配列に追加するメソッドへのアクセス
	private void tasu(int a, int b) {
		this.q = a + b;
		TestTasu = true;
		ListA(a, b);
		TestTasu = false;
	}

	private void hiku(int a, int b) {
		this.q = a - b;
		TestHiku = true;
		ListA(a, b);
		TestHiku = false;
	}

	private void kake(int a, int b) {
		this.q = a * b;
		TestKake = true;
		ListA(a, b);
		TestKake = false;
	}

	private void waru(int a, int b) {
		this.q = a / b;
		TestWaru = true;
		ListA(a, b);
		TestWaru = false;
	}

	//	二つ目以降の演算子の分岐
	public void setint(String a, int b) {
		if (a.equals("tasu")) {
			tasu(b);
		} else if (a.equals("hiku")) {
			hiku(b);
		} else if (a.equals("kake")) {
			kake(b);
		} else if (a.equals("waru")) {
			waru(b);
		}

	}

	//	二つ目以降の計算と式用の配列へのアクセス
	private void tasu(int a) {
		this.q = q + a;
		TestTasu = true;
		ListA(a);
		TestTasu = false;
	}

	private void hiku(int a) {
		this.q = q - a;
		TestHiku = true;
		ListA(a);
		TestHiku = false;
	}

	private void kake(int a) {
		this.q = q * a;
		TestKake = true;
		ListA(a);
		TestKake = false;
	}

	private void waru(int a) {
		if (a == 0) {
			System.out.println("エラー：0で割っています");
			System.exit(0);
		}
		this.q = q / a;
		TestWaru = true;
		ListA(a);
		TestWaru = false;
	}

	//	式用の配列への追加(最初)
	private void ListA(int a, int b) {
		String strA = Integer.toString(a);
		this.List.add(strA);
		if (TestTasu) {
			this.List.add(" + ");
		} else if (TestHiku) {
			this.List.add(" - ");
		} else if (TestKake) {
			this.List.add(" * ");
		} else if (TestWaru) {
			this.List.add(" / ");
		}
		String strB = Integer.toString(b);
		this.List.add(strB);
	}

	//	式用の配列への追加(二つ目以降)
	private void ListA(int a) {
		if (TestTasu) {
			this.List.add(" + ");
		} else if (TestHiku) {
			this.List.add(" - ");
		} else if (TestKake) {
			this.List.add(" * ");
		} else if (TestWaru) {
			this.List.add(" / ");
		}
		String strA = Integer.toString(a);
		this.List.add(strA);

	}

	//	計算結果をMainに返す
	public int getint() {
		return this.q;

	}
}
