package Number;

import java.util.Arrays;
import java.util.List;

public class SumOfAllNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,89,12,45,65,48,89,45,69,23,69);
		
		int sum = list.stream().reduce(0, Integer::sum);
		System.out.println("Sum of the elements is : " + sum);


	}

}
