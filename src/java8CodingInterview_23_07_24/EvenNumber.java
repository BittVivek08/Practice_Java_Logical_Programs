package java8CodingInterview_23_07_24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

	public static void main(String[] args) {
	
		List<Integer> number = Arrays.asList(22,89,65,47,86,32,44,78,901);
		
		 List<Integer> collect = number.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
		 System.out.println("Even numbers from the list is :: ");
		 for(Integer evenNum : collect) {
			 System.out.println(evenNum);
		 }
		 
		long count =  number.stream().filter(n -> n % 2 == 0).count();
		System.out.println("Total number of even Number in tthe list is :: " + count);

	}

}
