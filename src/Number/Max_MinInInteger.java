package number;

import java.util.Arrays;
import java.util.List;

public class Max_MinInInteger {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(56,98,45,36,99,100,45,77,88);
		
		Integer maxInt = list.stream().max(Integer :: compare).orElse(null);
		
		System.out.println("Maximum number in given List of Integer is :: " + maxInt);
		
		System.out.println("==============================================");
		
		Integer minValue = list.stream().min(Integer :: compare).orElse(null);
		
		System.out.println("Minimum number in given List of Integer is :: " + minValue);
	}

}
