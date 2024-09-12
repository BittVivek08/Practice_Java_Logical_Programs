package leetCodeProblems_String;

import java.util.HashMap;

public class RomanToInt {
	
	public static int romanToInt(String s) {
		HashMap<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
        	int current = romanMap.get(s.charAt(i));
        	if(i + 1 < s.length() && current < romanMap.get(s.charAt(i+1))) {
        		result -= current;
        	}else {
        		result += current;
        	}
        }
        return result;
	}

	public static void main(String[] args) {
		String input = "III";
		System.out.println("Input :: " + input + " ----> " + romanToInt(input));
		
		String input1 = "VII";
		System.out.println("Input :: " + input1 + " ----> " + romanToInt(input1));

		String input2 = "XIII";
		System.out.println("Input :: " + input2 + " ----> " + romanToInt(input2));
	}

}
