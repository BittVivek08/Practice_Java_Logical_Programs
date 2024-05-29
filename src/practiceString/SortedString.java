package practiceString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedString {

	public static void main(String[] args) {
		
		List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
				
		System.out.println("Original list of colors :: " + colors);
		
		System.out.println("=======================================================");

		
		List<String> sortedColor = colors.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Sorted color in ASCENDING order :: " + sortedColor);
		
		System.out.println("=======================================================");

		
		List<String> descSorted = colors.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println("Sorted color in DESCENDING order :: " + descSorted);
	
	}

}
