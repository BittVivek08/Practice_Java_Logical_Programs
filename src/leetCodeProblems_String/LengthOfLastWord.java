package leetCodeProblems_String;

public class LengthOfLastWord {
	
	public static int lengthLast(String str) {
		str = str.trim();
		
		int lastIndex = str.lastIndexOf(' ');
		return str.length() - lastIndex - 1;
	}

	public static void main(String[] args) {
		String s1 = "Hello World";
		System.out.println("Input : \"" + s1 + "\"");
        System.out.println("Length of the last word :: " + lengthLast(s1));
	}

}
