public class A {
	protected int[] numbers;

	public A(int x) {
		numbers = new int[x];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i * x;
		}
	}

	public void print() {
		System.out.print(this.toString());
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numbers.length; i++) {
			int count = numbers[i];
			for (int k = 0; k < count; k++) {
				sb.append("A");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}

class B extends A {
	public B(int x) {

		super(x);

	}

	public String toString() {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < numbers.length; i++) {

			int count = numbers[i];

			for (int k = 0; k < count; k++) {

				sb.append("B");

			}

			sb.append("\n");

		}

		return sb.toString();

	}

}