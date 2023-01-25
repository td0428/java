package r01AutumnAM01;

public class Main {

	public static void main(String[] args) {
		int[] nisin = new int[9];
		int j = 50; // 2進数に変換したい10進数
		for (int k = 1; k <= 8; k++) {
			nisin[k] = j % 2; // 2で割ったあまり(0 or 1)を配列nisinの箱に入れる
			j = j / 2;
		}
		for (int k = 8; k >= 1; k--) {
			System.out.println(nisin[k] + " "); // 配列nisinを逆から順に表示
		}
	}

}
