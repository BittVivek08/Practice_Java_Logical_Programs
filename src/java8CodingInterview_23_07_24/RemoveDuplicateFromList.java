package java8CodingInterview_23_07_24;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(22,89,22,89,86,32,44,78,89,89);
		long originalSize = number.size();
        number.stream().distinct().forEach(System.out::println);
        
        long distinct = number.stream().distinct().count();
        System.out.println("Total distinct number is :: " + distinct);
        long totalDupRemovedIs = originalSize - distinct;
        System.out.println("toatal duplicate removed is :: " + totalDupRemovedIs);
	}

}
