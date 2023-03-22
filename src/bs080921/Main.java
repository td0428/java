package bs080921;

public class Main {

	public static void main(String[] args) {
		Algorithm algorithm = (name) -> {
			System.out.println("hello, " + name);
		};
		Service service = new Service();
		service.setLogic(algorithm);
		service.doProcess("Lambda");
	}

}
