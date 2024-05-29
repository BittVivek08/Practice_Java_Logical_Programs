package number;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenFromList {

	public static void main(String[] args) {
		
	 List<Integer> list = Arrays.asList(10,15,20,8,64,97,102);
		
	 List<Integer> evenNumber = list.stream().filter(n -> n % 2 == 0)
	 //	.map(n -> n*n)
		.collect(Collectors.toList());
	
	    System.out.println("Even number from the given list are " + evenNumber);
		
	}

}
