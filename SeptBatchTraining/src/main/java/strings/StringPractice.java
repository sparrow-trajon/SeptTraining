package strings;

public class StringPractice {
	
	public static void main(String[] args) {
		
		String st= new String("This is orange");
		
		//System.out.println(st);
		
		/*
		 * getChar(8, st); getLength("This is very good orange..!!");
		 *
		 */
		
		/*
		 * String s="man"+"ish"; String s1=" kumar"; String s2=s+s1; String
		 * s3="manish kumar";
		 * 
		 * System.out.println(s2==s3);
		 */
		
		char c= 'g';
		String ch="g";
		boolean ifCharacterPresent=st.contains(ch);
		System.out.println(ifCharacterPresent);
		
		int index=st.indexOf(ch);
		System.out.println(index);
		
		
	}
	
	static void getChar(int pos, String str) {
		
		System.out.println(str.charAt(pos));
		
	}
	
	
	static void getLength(String str) {
		
		System.out.println(str.length());
	}
	
	

}
