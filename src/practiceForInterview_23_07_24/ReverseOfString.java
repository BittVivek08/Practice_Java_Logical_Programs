package practiceForInterview_23_07_24;

public class ReverseOfString {

	public static void main(String[] args) {
		String str = "Dream Big";
		
		System.out.println("Original String :: " + str);
		
		String reversedString = "";
		
		for(int i = str.length()- 1; i >= 0; i--) {
			reversedString = reversedString + str.charAt(i);
		}
		
		System.out.println("Reversed String :: " + reversedString);

	}

}
