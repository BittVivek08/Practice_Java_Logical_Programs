package number;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(11,5,4,5,6,9,8,9,7,6,8,9,11);
		
		System.out.println("Original List :: " + list);
		
		List<Integer> rmvDupElement = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Removed Duplicate List :: " + rmvDupElement);

	}

}
