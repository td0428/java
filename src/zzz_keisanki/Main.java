package zzz_keisanki;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String a = "0";
		String b = "0";
		String c = "0";
		String enzan;
		boolean r = true;

		Scanner s = new Scanner(System.in);
		Sub sub = new Sub();
		re: while (r) {

			//		一つ目の整数
			System.out.println("一つ目の整数を入力してください");
			a = s.next();
			System.out.println();

			//		演算子
			System.out.println("演算子を入力してください (「tasu」「hiku」「kake」「waru」のどれか)");
			enzan = s.next();
			System.out.println();

			//		二つ目の整数
			System.out.println("二つ目の整数を入力してください");
			b = s.next();
			System.out.println();

			if (enzan.equals("waru") && b.equals("0")) {
				System.out.println("エラー：入力しなおしてください(0で割っています)");
				continue re;
			}

			if (a.matches("^[0-9]+$|-[0-9]+$") && b.matches("^[0-9]+$|-[0-9]+$")
					&& (enzan.equals("tasu") || enzan.equals("hiku") || enzan.equals("kake") || enzan.equals("waru"))) {
				sub.setint(enzan, Integer.parseInt(a), Integer.parseInt(b));
			} else {
				System.out.println("エラー：入力しなおしてください");
				continue re;
			}

			System.out.println(sub.getint());

			//		連続入力
			a: do {
				System.out.println("終わる場合は「end」を入力。続ける場合は演算子を入力 (「tasu」「hiku」「kake」「waru」のどれか)");
				enzan = s.next();
				System.out.println();
				if (enzan.equals("end")) {
					r = false;
					break;
				}
				System.out.println("整数を入力してください");
				c = s.next();

				if (c.matches("^[0-9]+$|-[0-9]+$")&& (enzan.equals("tasu") || enzan.equals("hiku") || enzan.equals("kake")|| enzan.equals("waru"))) {
									System.out.println();
				sub.setint(enzan, Integer.parseInt(c));
				} else {
					System.out.println("エラー：入力しなおしてください");
					continue a;
				}


				System.out.println(sub.getint());
				System.out.println();
			} while (true);
		}

		int end = sub.getint();
		System.out.print("式：");
		for (String g : sub.List) {
			System.out.print(g);
		}
		System.out.println();
		System.out.println("計算結果は、「" + end + "」です");

	}

}
