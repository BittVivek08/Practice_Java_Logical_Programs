package string_Basic;

import java.util.Arrays;

public class AnagramCheck {
	
	// Two String are called anagram if both the String contain same String

	public static void main(String[] args) {
		
		String str1 = "Brag";
		String str2 = "Grab";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length() != str2.length()) {
			System.out.println("Both the String are NOT Anagram");
		}else {
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();
			
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			if(Arrays.equals(string1, string2) == true) {
				System.out.println("Both the String are Anagram");
			}else {
				System.out.println("Both the String are NOT Anagram");
			}
		}

	}

}
