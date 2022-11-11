package controlFlow;

public class HipHipHurre {
	
	
	public static void main(String[] args) {
		int number=66;
		
		display2(number);
		
	}
	
	public static void display(int x) {
		
		if(x %2 ==0) {
			if(x %3==0) {
				System.out.println("Hip Hip Hurre");
			}
			else {
				System.out.println("Hip Hip");
			}
		}
		else if(x %3 ==0) {
			System.out.println("Hurre");
		}
		else {
			System.out.println("Number is not divisible by 2 or 3 ");
		}
	}
	public static void display2(int x) {
		
		if(x % 2==0) {
			System.out.println("Hip Hip ");
		}
		else if(x %3 ==0) {
			System.out.println("Hurre");
		}
		else if(x%6==0) {
			System.out.println("Hip Hip Hurre");
		}
		else {
			System.out.println("Not divisible by either 2 or 3");
		}
	}

}
