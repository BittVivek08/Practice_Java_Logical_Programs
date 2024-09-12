package java8CodingInterview_23_07_24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithParticularNumber {

	public static void main(String[] args) {
		// List of number given . find all the number start with 1.
		List<Integer> num = Arrays.asList(12,23,56,14,32,19,25,18);
         System.out.println("Original list :: " + num);
	List<Integer>	nums = num.stream().filter(n -> String.valueOf(n).startsWith("1")).collect(Collectors.toList());
	
	System.out.println("Numbers starting with 1 are :: " + nums);
	}

}
