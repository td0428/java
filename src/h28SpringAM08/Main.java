package h28SpringAM08;

public class Main {

	public static void main(String[] args) {
		int q = 0;
		int x = 35;
		int y = 7;
		int r = x;

		while (true) {
			if (r < y) {
				break;
			} else if (r >= y) {
				r = r - y;
				q++;
			}
		}
		System.out.println(q);
		System.out.println(r);

	}

}
