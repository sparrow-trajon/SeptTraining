package controlFlow;

	public class ArrayQuestions {
		
		public static void main(String[] args) {
			
			int[] arr= {10,20,30,40,50,60,70,80};
			
			int n=40;
			
			int index=checkIfElementExists(arr,n);
			
			if(index!=-1) {
				System.out.println("Elements exists at "+ index +" position");
			}
			else {
				System.out.println("Element does not exists in the array ");
			}
			
		}
		
		public static int checkIfElementExists(int[] a, int b) {
			
			for(int i=0;i<a.length;i++) {
				
				if(a[i]==b) {
					return i;
				}
			}
			
			return -1;
		}
}
