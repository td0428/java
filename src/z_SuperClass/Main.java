package z_SuperClass;

public class Main {

	public static void main(String[] args) {
		Slime s = new Slime();
		Hero h = new Hero();

		h.attack();
		s.damage();
		System.out.println();
		s.attack();
		h.damage();

	}

}
