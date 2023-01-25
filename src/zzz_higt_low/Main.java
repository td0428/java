package zzz_higt_low;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Sub sub = new Sub();
		String a;

//		System.out.println("「h」or「l」");
//		System.out.println("場には「" + sub.a + "」");
//		a = s.next();
//		if (a.matches("[hl]")) {
//			sub.a(a);
//		} else {
//			System.out.println("wa");
//		}
//
//		System.out.println("「" + sub.b + "」が出た");
//		System.out.println("勝ち数「" + sub.count + "」");
//		if (sub.c == 0) {
//			System.out.println("残念");
//		}
//		System.out.println("-----------------------------");

		re: while (sub.c == 0) {
			System.out.println("場には「" + sub.a + "」");
			System.out.println("「h」or「l」");
			a = s.next();
			if (a.matches("[hl]")) {
				sub.a(a);
			}else {
				System.out.println("-----------------------------");
				System.out.println("やり直し (「h」or「l」のみ)");
				continue re;
			}
			
			System.out.println("「" + sub.b + "」が出た");
			System.out.println("勝ち数「" + sub.count + "」");
			if (sub.c == 1) {
				System.out.println("残念");

			}
			System.out.println("-----------------------------");
		}

	}

}
