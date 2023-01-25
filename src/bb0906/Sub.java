package bb0906;

public class Sub extends Super {
	public static void print() {
		System.out.println("Sub : " + name);
	}

	public static void main(String[] args) {
		Super a, b;
		a = new Super();
		b = new Sub();

		a.name = "A";
		b.name = "B";

		a.print();
		b.print();

	}

}
