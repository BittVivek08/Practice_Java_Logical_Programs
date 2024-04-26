package practiceStringWithoutJava8;

import java.util.Arrays;

public class ReplaceCharWithOccurence {

	public static void main(String[] args) {
		
		String input = "opentext";
		
		char charToReplace = 't';
		
		if(input.indexOf(charToReplace) == -1) {
			System.out.println("Given character is not present in text");
			System.exit(0);
		}
		
		int count = 1;
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(ch == charToReplace) {
			input = input.replaceAll(String.valueOf(charToReplace), String.valueOf(count));
			}
		}
		
		System.out.println(input);
		
		
		// if the character appears more than 10 times then this logic doesn't work
		char[] arr = input.toCharArray();
		int cnt = 1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == charToReplace) {
				arr[i] = String.valueOf(cnt).charAt(0);
				cnt++;
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
