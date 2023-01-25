package z_SuperClass;

public class Sub_super {
	String name;
	int hp;

	public void attack() {
		System.out.println(this.name + "の攻撃");
	}

	public void damage() {
		System.out.println(this.name + "はダメージを受けた");
		this.hp -= 5;
		System.out.println("残りHP:" + this.hp);
	}

	public void run() {

		System.out.println(this.name + "は逃げ出した");

		int rand = new java.util.Random().nextInt(2);
		if (rand == 0) {
			System.out.println(this.name + "は逃げた");
		} else {
			System.out.println("しかしまわりこまれた");
		}
	}
}
