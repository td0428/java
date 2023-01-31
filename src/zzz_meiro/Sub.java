package zzz_meiro;

import java.util.Random;

public class Sub {
	public String[][] bord;
	private int width;
	private int height;
	private int pointX;
	private int pointY;

	//	コンストラクター
	public Sub(int i, int j) {
		width = i;
		height = j;
		if (!(i % 2 == 0) && !(j % 2 == 0) && i >= 5 && j >= 5) {
			bord = new String[width][height];
			make();
		}
	}

	private void make() {
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				bord[i][j] = "■";
			}
		}
		hole();
	}

	private void hole() {
		Random randX = new Random();
		Random randY = new Random();
		pointX = randX.nextInt(width);
		pointY = randY.nextInt(height);

		if (!(pointX % 2 == 0) && !(pointY % 2 == 0)) {
			bord[pointX][pointY] = "  ";
		} else {
			hole();
		}
		road();
	}

	private void road() {
		Random VectorRandom = new Random();
		int vector = VectorRandom.nextInt(4);
		try {
			switch (vector) {
			case 0:
				if (bord[pointX - 2][pointY].equals("■")) {
					bord[pointX - 1][pointY] = "  ";
					bord[pointX - 2][pointY] = "  ";
				}
				break;
			case 1:
				if (bord[pointX][pointY + 2].equals("■")) {
					bord[pointX][pointY + 1] = "  ";
					bord[pointX][pointY + 2] = "  ";
				}
				break;
			case 2:
				if (bord[pointX + 2][pointY].equals("■")) {
					bord[pointX + 1][pointY] = "  ";
					bord[pointX + 2][pointY] = "  ";
				}
				break;
			case 3:
				if (bord[pointX][pointY - 2].equals("■")) {
					bord[pointX][pointY - 1] = "  ";
					bord[pointX][pointY - 2] = "  ";
				}
				break;
			}
		} catch (Exception e) {
		}

	}

	//	line関係はテスト用
	public void print() {
		int count = 0;
		int line = 0;
		for (String[] a : bord) {
			for (String b : a) {
				if (count % width == 0) {
					System.out.println();
					System.out.print(line);
					line++;
					if (line == 10) {
						line = 0;
					}
				}
				System.out.print(b);
				count++;
			}
		}

	}
}
