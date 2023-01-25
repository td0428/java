package zzz_janken;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String a;
		int b;
		boolean re = true;
		Scanner s = new Scanner(System.in);
		Sub sub = new Sub();
		while (re) {
			//		自分の手を入力
			System.out.println("「1」(グー)、「2」(チョキ)、「3」(パー)を入力");
			a = s.next();
			if (a.matches("[1-3]{1}")) {
				re = false;
				sub.jan(Integer.parseInt(a));
			}else {
				System.out.println("エラー：「1」(グー)、「2」(チョキ)、「3」(パー)を入力");
			}

		}

		//		計算
		b = sub.kekka();
		//		勝負の表示
		System.out.println("あなたは、「" + sub.myhand + "」  相手は、「" + sub.youhand + "」");
		if (b == 0) {
			System.out.println("あいこでした");
			System.out.println();
		} else if (b == 1) {
			System.out.println("あなたの負け");
		} else if (b == 2) {
			System.out.println("あなたの勝ち");
		}

		//		あいこの場合
		while (b == 0) {
			System.out.println("もう一度「1」(グー)、「2」(チョキ)、「3」(パー)を入力");
			a = s.next();
			if (a.matches("[1-3]{1}")) {
				sub.jan(Integer.parseInt(a));
			}
			b = sub.kekka();
			System.out.println("あなたは、「" + sub.myhand + "」  相手は、「" + sub.youhand + "」");
			if (b == 0) {
				System.out.println("あいこでした");
				System.out.println();
			} else if (b == 1) {
				System.out.println("あなたの負け");
			} else if (b == 2) {
				System.out.println("あなたの勝ち");
			}

		}
	}

}
