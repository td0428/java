package z_saiki;

public class Main {

	public static void main(String[] args) {
		System.out.println(a(3));

	}

	public static int a(int a) {
		if (a <= 0) {
			return 0;
		} else {
			return a + a(a - 1);
		}
	}

}
