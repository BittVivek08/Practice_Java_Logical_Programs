package number;

import java.util.Arrays;
import java.util.List;

public class SumOfOddEven {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,10,6,9,5,7);
		
		int sumOfEven = list.stream().filter(num -> num % 2 ==0)
		.mapToInt(Integer :: intValue)
		.sum();
		
		System.out.println("Sum of even numbers from list is :: " + sumOfEven);
		
		int sumOfOdd = list.stream().filter(num -> num % 2 != 0)
		.mapToInt(Integer :: intValue)
		.sum();
		
		System.out.println("Sum of odd numbers from the list is :: " + sumOfOdd);

	}

}
