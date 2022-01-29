package chapter3_operator.Q10;

public class Sample {
	private int num;

	public Sample(int num) {
		this.num = num;
	}

	public boolean equals(Sample obj) {
		if (obj == null) {
			return false;
		}
		return this.num == obj.num;
	}

	public Sample getThis() {
		return this;
	}
}
