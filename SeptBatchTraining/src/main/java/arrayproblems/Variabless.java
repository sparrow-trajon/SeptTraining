package arrayproblems;

public class Variabless {

	static int x = 10;
	int y = 100;

	public static void main(String[] agrs) {
		Variabless v = new Variabless();

		System.out.println(x);
		v.y = 10000;
		System.out.println(v.y);

		v.x = 200;

		disp1();

	}

	public static void disp1() {
		// System.out.println(new Variabless().x);

		Variabless v = new Variabless();
		System.out.println(x);

		System.out.println(v.y);
	}

}
