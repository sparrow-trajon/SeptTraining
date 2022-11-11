package arrayproblems;

public class Pair {

	public static void main(String[] args) {

		int[] a = { -20, -10, -6, -2, 10, 20, 30, 40, 50 };
		int n = 4;

		//findThePairWithBruteForce(a, n);
		findThePairWithSmartness(a,n);
	}

	public static void findThePairWithBruteForce(int[] a, int b) {

		int len = a.length;

		for (int i = 0; i < len - 1; i++) {

			for (int j = i + 1; j < len; j++) {
				if (a[i] + a[j] == b) {
					System.out.println("Yes we found the numbers: " + a[i] + " " + a[j]);
					break;
				}

			}
		}
	}
	
	
	public static void findThePairWithSmartness(int[] a, int b) {
		
		int len=a.length;
		
		int p1=0;
		int p2=len-1;
		
		while(p2>p1) {
			if(a[p1]+a[p2]==b) {
				System.out.println("Yes we have fond the numbers :-"+ a[p1]+" "+ a[p2]);
				break;
			}
			else if(a[p1]+a[p2]<b) {
				p1+=1;
			}
			else if(a[p1]+a[p2]>b) {
				p2-=1;
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
