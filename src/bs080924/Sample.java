package bs080924;

public class Sample {

	public static void main(String[] args) {
		int cut = 0;
		Runnable r = () -> {
			for (cut = 0; cut < 10; cut++) {
				System.out.println(cut++);
			}
		};
		new Thread(r).start();

	}

}
