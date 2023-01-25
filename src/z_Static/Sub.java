package z_Static;

public class Sub {
	int a;
	static int b;

	public void sample() {
		a++;
		b++;
	}

	public void print() {
		System.out.println(a + ":" + b);
	}
}
