package z_equals;

public class Main {

	public static void main(String[] args) {
		String test1 = "Hello";
		String test2 = "Hello";
		// 文字列を追加すると参照型になる
		test1 += "!";
		test2 += "!";

		// == では参照場所を比較
		System.out.println(test1 == test2);

		// equals では文字列を比較
		System.out.println(test1.equals(test2));
	}
}
