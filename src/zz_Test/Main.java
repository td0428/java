package zz_Test;

class Foo {
	int a;

	Foo() {
		a = 10;
	}

	Foo(int a) {
		this.a = a;
	}
}

class Bar extends Foo {
	int b, c;

	Bar(int a, int b, int c) {
		super(a);
		this.c = c;
	}
}

public class Main {
	public static void main(String[] args) {
		Bar bar = new Bar(100, 200, 300);
		System.out.println("a:" + bar.a + "b:" + bar.b + "c:" + bar.c);
	}

}