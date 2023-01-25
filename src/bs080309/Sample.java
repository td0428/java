package bs080309;

public class Sample {
	private int num;
	private String name;

	public Sample(int num, String name) {
		this.num = num;
		this.name = name;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof Sample) {
			Sample sample = (Sample) obj;
			return sample.num == this.num;
		}
		return false;
	}
}
