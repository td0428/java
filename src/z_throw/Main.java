package z_throw;

public class Main {

	public static void main(String[] args) { // 消さない

		Number num = new Number();
		num.setAge(-19);

	} // 消さない

} // 消さない

class Number {
	int age;

	void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("年齢は正の数を指定してください。指定値=" + age);
		}
		this.age = age;
		System.out.println("年齢は" + age + "です。");
	}
}
