package simpleExample;

public class InnerClassExample {

	public static void main(String[] args) {
		class Person implements SayHello {
			public void hello() {
				System.out.println("こんにちは");
			}
		}
		Person p = new Person();
		Greeting.greet(p);

	}

}
