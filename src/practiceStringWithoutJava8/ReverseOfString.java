package practiceStringWithoutJava8;

public class ReverseOfString {

	public static void main(String[] args) {

		String str = "Hello";
		
		// Approach - I
		 char[] charArray = str.toCharArray();
		 
		 for(int i = charArray.length - 1; i >= 0; i--) {
			 System.out.print(charArray[i]);
		 }
		 System.out.println();
		 
		 //Approach - II
		 for(int i = str.length() - 1; i >= 0; i--) {
			 
			 System.out.print(str.charAt(i));
		 }
		 
		 System.out.println();
		 
		 // Approach - III
		 StringBuffer sb = new StringBuffer(str);
		 System.out.println(sb.reverse());
		 
		 //Approach - IV
		 
		 StringBuilder sb1 = new StringBuilder(str);
		 System.out.println(sb1.reverse());
	}

}
