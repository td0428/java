package z_interface;

public class Main {

	public static void main(String[] args) {

		Life[] a = { new Dog(), new Cat() };

		for (Life i : a) {
			i.move();
			i.cry();
		}
	}

}
