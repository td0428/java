package zz_Test;

import java.util.Random;

public class Main {
 static	int width=21;
static	int height=21;
static int pointX;
static int pointY;
	public static void main(String[] args) {
		re:	do {
			Random randX = new Random();
			Random randY = new Random();
			pointX = randX.nextInt(width);
			pointY = randY.nextInt(height);

			System.out.println(pointX);
			System.out.println(pointY);
			if (!(pointX % 2 == 0) && !(pointY % 2 == 0)) {
				System.out.println("OK");
			}
		} while (pointX % 2 == 0 || pointY % 2 == 0);
	}

}