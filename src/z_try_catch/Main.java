package z_try_catch;

public class Main {

	public static void main(String[] args) { // 消さない
		int[] a = { 1, 2, 3 };
		try {
			a[3] = 5;
		} catch (Exception e) {
			System.out.println("no");
		} finally {
			System.out.println("終了");
		}
	} // 消さない

} // 消さない
