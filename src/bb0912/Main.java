package bb0912;

public class Main {

	public static void main(String[] args) {
		String a1 = "A";
		String a2 = new String("A");
		String a3 = new String("A");

		if (a1 == a2) {
			System.out.println("a1 == a2");

		} else {
			System.out.println("a1 != a2");
		}

		if (a2 == a3) {
			System.out.println("a2 == a3");
		} else {
			System.out.println("a2 != a3");
		}
	}

}
