package practiceForInterview_23_07_24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OccurenceOfNumber {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers =  new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(2);
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		numbers.add(2);
		numbers.add(3);
		numbers.add(3);
		numbers.add(4);
		
		
		// call the method 
		Map<Integer, Integer> occurrences = findOccurrences(numbers);
		
		//Print the occurrence
		for(Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
			System.out.println("ELEMENT : " + entry.getKey() + " , OCCURRENCES : " + entry.getValue() );
		}

	}
	
	// Method to find the occurrence
	public static Map<Integer, Integer> findOccurrences(ArrayList<Integer> list){
		Map<Integer, Integer> occurrenceMap = new HashMap<>();
		
		for(Integer element : list) {
			if(occurrenceMap.containsKey(element)) {
				occurrenceMap.put(element, occurrenceMap.get(element) + 1);
				
			}else {
				occurrenceMap.put(element, 1);
			}
		}
		
		return occurrenceMap;
		
	}

}
