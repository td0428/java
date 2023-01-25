package zzz_scout;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Monster m = new Monster();
		Scout scout = new Scout();
		Hero h = new Hero();
		Scanner s = new Scanner(System.in);
		String level = "0";
		String a;
		int b;
		boolean re = true;

		//		モンスター選択
		re: while (re) {
			System.out.println("レベルを入力してください。「1」,「10」,「100」");
			level = s.next();
			if (level.equals("1") || level.equals("10") || level.equals("100")) {
				m.select(Integer.parseInt(level));
				re = false;
			} else {
				System.out.println("エラー：「1」,「10」,「100」のみ");
				continue re;
			}
		}

		if (level.equals("1")) {
			System.out.println(m.name + "があらわれた");
			System.out.println("相手のHPは" + m.hp + "です");
		} else if (level.equals("10")) {
			System.out.println(m.name + "があらわれた");
			System.out.println("相手のHPは" + m.hp + "です");
		} else if (level.equals("100")) {
			System.out.println(m.name + "があらわれた");
			System.out.println("相手のHPは" + m.hp + "です");
		}

		//		自分の手を入力
		end: while (!(h.hp <= 0 || m.hp <= 0)) {
			scout.scout = 0;
			System.out.println("------------------------------------------------------");
			System.out.println("「1」(グー)、「2」(チョキ)、「3」(パー)、「00」(スカウト)を入力");
			a = s.next();
			if (!(a.equals("1") || a.equals("2") || a.equals("3") || a.equals("00") )) {
				System.out.println("エラー:「1」「2」「3」「00」のみ");
				continue end;
			}

			//		計算
			scout.jan(Integer.parseInt(a));
			if (scout.scout == 1) {
				System.out.println("スカウト成功「" + m.name + "」をつかまえた");
				break end;
			} else if (scout.scout == 2) {
				System.out.println("スカウト失敗");
				h.hp = h.hp - m.attack;
				System.out.println(m.attack + "のダメージ");
				System.out.println("自分のHP:" + h.hp + " 、 " + m.name + "のHP:" + m.hp + " 、スカウト確率"
						+ Math.round(scout.percent) + "%");
				scout.scout = 0;
				continue end;
			}
			b = scout.kekka();

			//		勝負の表示
			System.out.println("あなたは、「" + scout.myhand + "」  相手は、「" + scout.youhand + "」");
			if (b == 0) {
				System.out.println("あいこでした");
				System.out.println();
			} else if (b == 1) {
				System.out.println("あなたの負け");
				System.out.println(m.attack + "のダメージ");
				h.hp = h.hp - m.attack;
				scout.percent();
				System.out.println("自分のHP:" + h.hp + " 、 " + m.name + "のHP:" + m.hp + " 、スカウト確率"
						+ Math.round(scout.percent) + "%");
			} else if (b == 2) {
				System.out.println("あなたの勝ち");
				h.attack();
				if (h.attack == 30) {
					System.out.println("会心の一撃");
				}
				System.out.println(h.attack + "のダメージ");
				m.hp = m.hp - h.attack;
				scout.percent();
				System.out.println("自分のHP:" + h.hp + " 、 " + m.name + "のHP:" + m.hp + " 、スカウト確率"
						+ Math.round(scout.percent) + "%");
			}

			//		あいこの場合
			while (b == 0) {
				System.out.println("------------------------------------------------------");
				System.out.println("もう一度「1」(グー)、「2」(チョキ)、「3」(パー)、「00」(スカウト)を入力");
				a = s.next();
				scout.jan(Integer.parseInt(a));

				if (!(a.equals("1") || a.equals("2") || a.equals("3") || a.equals("00") )) {
					System.out.println("エラー:「1」「2」「3」「00」のみ");
					continue end;
				}

				if (scout.scout == 1) {
					System.out.println("スカウト成功");
					break end;
				} else if (scout.scout == 2) {
					System.out.println("スカウト失敗");
					h.hp = h.hp - m.attack;
					System.out.println(m.attack + "のダメージ");
					System.out.println("自分のHP:" + h.hp + " 、 " + m.name + "のHP:" + m.hp + " 、スカウト確率"
							+ Math.round(scout.percent) + "%");
					scout.scout = 0;
					continue end;
				}
				b = scout.kekka();
				System.out.println("あなたは、「" + scout.myhand + "」  相手は、「" + scout.youhand + "」");
				if (b == 0) {
					System.out.println("あいこでした");
					System.out.println();
				} else if (b == 1) {
					System.out.println("あなたの負け");
					System.out.println(m.attack + "のダメージ");
					h.hp = h.hp - m.attack;
					scout.percent();
					System.out.println("自分のHP:" + h.hp + " 、 " + m.name + "のHP:" + m.hp + " 、スカウト確率"
							+ Math.round(scout.percent) + "%");

				} else if (b == 2) {
					System.out.println("あなたの勝ち");
					h.attack();
					if (h.attack == 30) {
						System.out.println("会心の一撃");
					}
					System.out.println(h.attack + "のダメージ");
					m.hp = m.hp - h.attack;
					scout.percent();
					System.out.println("自分のHP:" + h.hp + " 、 " + m.name + "のHP:" + m.hp + " 、スカウト確率"
							+ Math.round(scout.percent) + "%");

				}

			}

		}
		System.out.println("------------------------------------------------------");
		if (h.hp <= 0) {
			System.out.println("目の前が真っ暗になった");
		} else if (m.hp <= 0) {
			System.out.println(m.name + "を倒した");
		}
	}
}
