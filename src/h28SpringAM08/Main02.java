package h28SpringAM08;

/*
 * 基本情報技術者試験H28春午前問08(商と余りを求めるフローチャート)
 * 基本情報技術者試験H25春午前問08
 */
public class Main02 {

	public static void main(String[] args) {
		int x = 15; // 割られる数
		int y = 3; // 割る数

		int q = 0;
		int r = x;

		while (true) {
			if (r < y) {
				break;
			}
			r = r - y;
			q++;
		}

		System.out.println(q); // 商
		System.out.println(r); // 余り
	}

}
