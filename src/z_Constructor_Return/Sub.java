package z_Constructor_Return;

public class Sub {
	public Sub() {
		System.out.println("a");
	}

	public Sub(int a) {
		System.out.println("b");
	}

	public Sub(int a, int b) {
		System.out.println("c");
	}

	public int a(int a, int b) {
		return a + b;
	}
}
