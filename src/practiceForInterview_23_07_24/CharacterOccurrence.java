package practiceForInterview_23_07_24;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrence {

	public static void main(String[] args) {
		
		String input = "bittu vivek";
		input = input.replace(" ", "");
		String input1 = input.toLowerCase();
		
		Map<Character, Integer> occurrences = findOccurrences(input1);
		
		for(Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
	   System.out.println("CHARACTER : " + entry.getKey() + ", OCCURRENCES : " + entry.getValue());
			
		}

	}
	
	public static Map<Character, Integer> findOccurrences(String str){
		Map<Character, Integer> occurrenceMap = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			if(occurrenceMap.containsKey(ch)) {
				occurrenceMap.put(ch, occurrenceMap.get(ch) + 1);
			}else {
				occurrenceMap.put(ch, 1);
			}
		}
		return occurrenceMap;
	}

}
