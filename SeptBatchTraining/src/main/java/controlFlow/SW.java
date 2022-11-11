package controlFlow;

public class SW {

	public static void main(String[] args) {
		byte num=101;
	//	display(num);
		evenOdd(num);
	}
	
	public static void evenOdd(int n) {
		String result=(n % 2==0)?"Number is even":"Number is odd";
		System.out.println(result);
	}
	
	
	public static void display(byte x) {
		
		 final int var=100;
		
		switch (x) {
		case 10:
			System.out.println("X is 10");
		case 50:
			System.out.println("X is 20");

		case 60:
			System.out.println("X is 30");
			break;
		case var:
			System.out.println("X is 40");
		default:
			System.out.println("X is nothing ");
		}
	}
}
