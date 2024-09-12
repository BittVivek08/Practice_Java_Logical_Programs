package java8CodingInterview_23_07_24;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SumOfElementFromList {

	public static void main(String[] args) {

		List<Integer> number = new ArrayList<Integer>();

		number.add(45);
		number.add(56);
		number.add(14);
		number.add(45);
		number.add(89);
		number.add(11);
		number.add(60);

		// Sum of the element
		int sum = number.stream().mapToInt(Integer::intValue).sum();

		System.out.println("Sum of elements is :: " + sum);

		// Maximum element from this list by stream

		int maxElement = number.stream().mapToInt(Integer::intValue).max().getAsInt();

		System.out.println("Maximum number from the list is :: " + maxElement);

		// Maximum element from this list by stream another way

		int max2 = number.stream().max(Comparator.naturalOrder()).get();

		System.out.println("Maximum number from the list is by 2nd Approach :: " + max2);

	}

}
