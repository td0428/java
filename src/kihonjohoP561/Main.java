package kihonjohoP561;

public class Main {

	public static void main(String[] args) {
		int x = 0;
		int i = 1;
		while (true) {
			if (i > 10) {
				break;
			}
			x = x + i;
			i++;
		}
		System.out.println(x);
	}

}
