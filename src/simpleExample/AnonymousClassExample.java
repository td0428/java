package simpleExample;

public class AnonymousClassExample {

	public static void main(String[] args) {
/*		Greeting.greet(new SayHello() {
			public void hello() {
				System.out.println("こんにちは");
			}
		});
*/
		Greeting.greet( () -> {System.out.println("こんにちは");});
	}

}
