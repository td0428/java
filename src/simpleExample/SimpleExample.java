package simpleExample;

class Person implements SayHello {
	public void hello() {
		System.out.println("こんにちは");
	}
}

public class SimpleExample {
	public static void main(String[] args) {
		Person p = new Person();
		Greeting.greet(p);
	}
}
