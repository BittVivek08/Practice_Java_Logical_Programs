package practiceString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateWord {
	
	public static List<String> rmvDupWords(List<String> words){
		return words.stream().distinct().collect(Collectors.toList());
	}

	public static void main(String[] args) {
		
	List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
	
	List<String> removedDup = rmvDupWords(words);
	
	System.out.println("Original List of fruits :: " + words);
	
	System.out.println("Removed duplicate fruit from the list :: " + removedDup);
	
	}

}
