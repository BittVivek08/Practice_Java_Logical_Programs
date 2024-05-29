package number;

import java.util.stream.IntStream;

public class SumOfNumbers {

	public static void main(String[] args) {
	   
		int total = IntStream.range(25, 50).map(Integer :: new).sum();
		System.out.println("The Sum of first 50 number is : " +total);

	}

}
