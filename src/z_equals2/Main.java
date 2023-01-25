package z_equals2;

public class Main {

	public static void main(String[] args) { // 消さない
		String a = "good";
		String b = "good";
		String c = new String("good");

		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));

		// aとbは同じ文字列なので同じ場所を参照している
		// cはnewを使うことでオブジェクトを新しく作っている

	} // 消さない

} // 消さない
