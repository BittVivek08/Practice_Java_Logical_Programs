package java8CodingInterview_23_07_24;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondLargest {

	public static void main(String[] args) {

     List<Integer> numbers = Arrays.asList(1,5,1,6,9,8,7);
     
     Optional<Integer> findFirst = numbers.stream().distinct().sorted((a, b) -> b - a ).skip(1).findFirst();
     
     Integer secondLargest = findFirst.get();
     
     System.out.println("Second Largest from the list is :: "  + secondLargest);
	}

}
