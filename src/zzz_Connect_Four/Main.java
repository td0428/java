package zzz_Connect_Four;

import java.util.Scanner;

public class Main {

	static String[][] bord = new String[6][7];
	static int turn = 0;
	static int column_0 = 5;
	static int column_1 = 5;
	static int column_2 = 5;
	static int column_3 = 5;
	static int column_4 = 5;
	static int column_5 = 5;
	static int column_6 = 5;
	static boolean han;
	static String maru = "〇";
	static String batu = "●";

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int q = 0;

		//		配列を[  ]に初期化
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				bord[i][j] = "[  ]";
			}
		}
		//		配列を表示
		re: while (true) {
			System.out.println("--------------------------------");
			System.out.println("[０][１][２][３][４][５][６]");
			for (String[] a : bord) {
				for (String b : a) {

					if (q % 7 == 0) {
						System.out.println();
					}
					System.out.print(b);
					q++;
				}
			}
			System.out.println();
			System.out.println("--------------------------------");

			//			勝敗判定
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					yoko(i, j);
					tate(i, j);
					nana1(i, j);
					nana2(i, j);
					if (han == true) {
						break re;
					}
				}

			}
			String w = s.next();
			if (w.equals("0") || w.equals("1") || w.equals("2") || w.equals("3") || w.equals("4") || w.equals("5") || w.equals("6")) {
				a(Integer.parseInt(w));
			} else {
				System.out.println("やり直し：0~6まで");
				continue re;
			}

		}

	}

	//	〇、×を表示
	public static void a(int a) {
		try {
			if (turn % 2 == 0) {
				switch (a) {
				case 0:
					bord[column_0][a] = "[" + maru + "]";
					column_0--;
					break;
				case 1:
					bord[column_1][a] = "[" + maru + "]";
					column_1--;
					break;
				case 2:
					bord[column_2][a] = "[" + maru + "]";
					column_2--;
					break;
				case 3:
					bord[column_3][a] = "[" + maru + "]";
					column_3--;
					break;
				case 4:
					bord[column_4][a] = "[" + maru + "]";
					column_4--;
					break;
				case 5:
					bord[column_5][a] = "[" + maru + "]";
					column_5--;
					break;
				case 6:
					bord[column_6][a] = "[" + maru + "]";
					column_6--;
					break;
				}

			} else if (turn % 2 == 1) {
				switch (a) {
				case 0:
					bord[column_0][a] = "[" + batu + "]";
					column_0--;
					break;
				case 1:
					bord[column_1][a] = "[" + batu + "]";
					column_1--;
					break;
				case 2:
					bord[column_2][a] = "[" + batu + "]";
					column_2--;
					break;
				case 3:
					bord[column_3][a] = "[" + batu + "]";
					column_3--;
					break;
				case 4:
					bord[column_4][a] = "[" + batu + "]";
					column_4--;
					break;
				case 5:
					bord[column_5][a] = "[" + batu + "]";
					column_5--;
					break;
				case 6:
					bord[column_6][a] = "[" + batu + "]";
					column_6--;
					break;
				}
			}
			turn++;
		} catch (Exception e) {
			System.out.println("その列はもう置けません");
		}

	}

	//	判定 "ー"
	public static void yoko(int a, int b) {
		try {
			if (!(bord[a][b].equals("[" + maru + "]"))) {

			} else if (bord[a][b].equals("[" + maru + "]")) {
				if (bord[a][b + 1].equals("[" + maru + "]")) {
					if (bord[a][b + 2].equals("[" + maru + "]")) {
						if (bord[a][b + 3].equals("[" + maru + "]")) {
							System.out.println(maru + "の勝ち");
							han = true;
						}
					}
				}
			}
			if (!(bord[a][b].equals("[" + batu + "]"))) {

			} else if (bord[a][b].equals("[" + batu + "]")) {
				if (bord[a][b + 1].equals("[" + batu + "]")) {
					if (bord[a][b + 2].equals("[" + batu + "]")) {
						if (bord[a][b + 3].equals("[" + batu + "]")) {
							System.out.println(batu + "の勝ち");
							han = true;
						}
					}
				}
			}
		} catch (Exception e) {
		}
	}

	//	判定 "|"
	public static void tate(int a, int b) {
		try {
			if (!(bord[a][b].equals("[" + maru + "]"))) {

			} else if (bord[a][b].equals("[" + maru + "]")) {
				if (bord[a + 1][b].equals("[" + maru + "]")) {
					if (bord[a + 2][b].equals("[" + maru + "]")) {
						if (bord[a + 3][b].equals("[" + maru + "]")) {
							System.out.println(maru + "の勝ち");
							han = true;
						}
					}
				}
			}
			if (!(bord[a][b].equals("[" + batu + "]"))) {

			} else if (bord[a][b].equals("[" + batu + "]")) {
				if (bord[a + 1][b].equals("[" + batu + "]")) {
					if (bord[a + 2][b].equals("[" + batu + "]")) {
						if (bord[a + 3][b].equals("[" + batu + "]")) {
							System.out.println(batu + "の勝ち");
							han = true;
						}
					}
				}
			}
		} catch (Exception e) {
		}

	}

	//	判定 "/"
	public static void nana1(int a, int b) {
		try {
			if (!(bord[a][b].equals("[" + maru + "]"))) {

			} else if (bord[a][b].equals("[" + maru + "]")) {
				if (bord[a + 1][b + 1].equals("[" + maru + "]")) {
					if (bord[a + 2][b + 2].equals("[" + maru + "]")) {
						if (bord[a + 3][b + 3].equals("[" + maru + "]")) {
							System.out.println(maru + "の勝ち");
							han = true;
						}
					}
				}
			}
			if (!(bord[a][b].equals("[" + batu + "]"))) {

			} else if (bord[a][b].equals("[" + batu + "]")) {
				if (bord[a + 1][b + 1].equals("[" + batu + "]")) {
					if (bord[a + 2][b + 2].equals("[" + batu + "]")) {
						if (bord[a + 3][b + 3].equals("[" + batu + "]")) {
							System.out.println(batu + "の勝ち");
							han = true;
						}
					}
				}
			}
		} catch (Exception e) {
		}

	}

	public static void nana2(int a, int b) {
		try {
			if (!(bord[a][b].equals("[" + maru + "]"))) {

			} else if (bord[a][b].equals("[" + maru + "]")) {
				if (bord[a + 1][b - 1].equals("[" + maru + "]")) {
					if (bord[a + 2][b - 2].equals("[" + maru + "]")) {
						if (bord[a + 3][b - 3].equals("[" + maru + "]")) {
							System.out.println(maru + "の勝ち");
							han = true;
						}
					}
				}
			}
			if (!(bord[a][b].equals("[" + batu + "]"))) {

			} else if (bord[a][b].equals("[" + batu + "]")) {
				if (bord[a + 1][b - 1].equals("[" + batu + "]")) {
					if (bord[a + 2][b - 2].equals("[" + batu + "]")) {
						if (bord[a + 3][b - 3].equals("[" + batu + "]")) {
							System.out.println(batu + "の勝ち");
							han = true;
						}
					}
				}
			}
		} catch (Exception e) {
		}

	}

}
