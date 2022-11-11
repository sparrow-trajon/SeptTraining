package strings;

public class FuzzBuzz {

	public static void main(String[] args) {

		int x = 103;

		checkIfFuzzBuzz(x);

	}

	static void checkIfFuzzBuzz(int var) {

		if (var % 2 == 0) {
			System.out.println("Fuzz");
			System.out.println("This is even");
		}

		else {
			System.out.println("Buzz");

		}
	}
}
